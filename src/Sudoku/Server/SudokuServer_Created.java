package Sudoku.Server;  // 'a' for 'annotation'

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.Oneway;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.jws.soap.SOAPBinding.ParameterStyle;

@WebService(name            = "AnnotatedSudokuServer",
            serviceName     = "RevisedSudokuServer",
            targetNamespace = "Sudoku")
@SOAPBinding(style          = SOAPBinding.Style.DOCUMENT,
             use            = SOAPBinding.Use.LITERAL,
             parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class SudokuServer_Created {
    @WebMethod(operationName   = "checkBoard")
    @WebResult(name            = "checkBoardOut",
               targetNamespace = "Sudoku")
    
    
    
    //board format is a string with each value delimuted by a comma. 
    
    /*
    1 2 3
    4 5 6
    7 8 9
    
    translates to 
    1,2,3,4,5,6,7,8,9
    */
    
    
    private int[][] convertStringToBoard(String str)
    {
     
        int[][] board = new int[9][9];
        String[] stringNums = str.split(",");

        
        for(int i = 0; i < stringNums.length; i++)
        {
            if(!stringNums[i].isEmpty())
                board[i%9][Math.floorDiv(i, 9)] = Integer.parseInt(stringNums[i]);           
        }
        
        
        System.out.println("StB Result: " + str);
        return board;
    }
    
    private String convertBoardToString(int[][] board)
    {
        
       String s = "";
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                s += board[j][i] + ",";
            }
        }
        
        System.out.println("BtS(int) Result: " + s);
        return s;
    }
    
    private String convertBoardToString(String[][] board)
    {
        String s = "";
        
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(board[j][i].isEmpty())
                    s+=",";
                else
                    s+=board[j][i] + ",";
            }
        }
        
        
        System.out.println("BtS(String) Result: " + s);
        return s;
    }
    
    
    
    public String checkBoard(
       @WebParam(name            = "checkBoardInput",
                 targetNamespace = "Sudoku",
                 mode            = WebParam.Mode.IN)
       String msg) {
        System.out.println("Checking Board");
        System.out.println("Recieved Message: " + msg);
        
        int[][] board = convertStringToBoard(msg);
        
		
	  if (cb(board)) {
            return "Valid Board";
        } else {
            return "Invalid Board";
        }	
        
        
    }

     public boolean cb(int brd[][]) {
        int[] row = new int[9];
        int[] column = new int[9];
        int[] box = new int[9];

        int x, y;

        for (int i = 0; i < 9; i++) {
            //clear arrays from before
            for (int k = 0; k < 9; k++) {
                row[k] = 0;
                column[k] = 0;
                box[k] = 0;
            }

            for (int j = 0; j < 9; j++) {
                row[j] = brd[i][j];
                column[j] = brd[j][i];

                x = (i / 3) * 3 + j / 3;
                y = i * 3 % 9 + j % 3;

                box[j] = brd[x][y];

                //System.out.println("Row:\t[" + row[j] + "]");
                //System.out.println("Column:\t[" + column[j] + "]");
                //System.out.println("Box:\t[" + box[j] + "]");
            }

            //System.out.println("-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-");
            if (!verifyUnique(row) || !verifyUnique(column) || !verifyUnique(box)) {
                return false;
            }

        }

    
       
        return true;

    }
    
     public boolean verifyUnique(int[] ia) {

        Arrays.sort(ia);
        ArrayList<Integer> usedValues;
        usedValues = new ArrayList<>();

        for (int i = 0; i < ia.length; i++) {
            if (ia[i] == 0) {
                continue;
            }
            for (int j = 0; j < usedValues.size(); j++) {
                if (usedValues.get(j) == ia[i]) {

                    return false;
                }

            }
            usedValues.add(ia[i]);

        }

        return true;

    }
    
    
    
    @WebMethod (operationName = "solveBoard")
    public String solveBoard(
         @WebParam (name = "checkBoardInput", targetNamespace = "Sudoku", mode = WebParam.Mode.IN) 
         String str) { 
        
        
	System.out.println("Solving Board: " + str);
	
        int[][] brd = convertStringToBoard(str);
        sb(brd);

	return convertBoardToString(myBoardHolding);  
    }
    
    
    
    
    
    private String[][] myBoardHolding = new String[9][9];
    
    
    
     public boolean sb(int[][] board) {

         
         for(int i = 0; i < 9; i ++)
         {
             for(int j = 0; j < 9; j ++)
             {
                 myBoardHolding[i][j] = "";
             }
         }
         
         
        //This is the bactracking algorithm
        for (int row = 0; row < 9; row++) { //loop over rows
            for (int column = 0; column < 9; column++) { //loop over columns 
                if (board[row][column] == 0) { //check to see if initial value is 0. If it's not 0, that means it was a constant and should be ignored, as it is gaurenteed to be "correct"
                    for (int k = 1; k <= 9; k++) { //loop over all possible values (1-9)
                        board[row][column] = k; //set value to k, the incrementing of each possible value 
                       myBoardHolding[row][column] = k + ""; //updates the display to reflect this value 
                        if (sb(board) && cb(board)) { //checks that the current board is a valid board state. Also, checks to make sure all recursive boards after it are valid board states 
                            //System.out.println(row +", " + column);
                            return true; //if true, it's a valid board state! 
                        }
                        board[row][column] = 0; //if not a valid board state, reset value, allowing for the next increment of k to be used, and then try again.
                    }

                    return false;
                }
            }
        }
        return true;
    }
    
    
    
    
    
    
    
    
    

    @WebMethod
    public String generateBoard(String msg) { 
	
        System.out.println("Generating Board...");
	
        int mostRecentlyGenerated = -1;
        
         Random rand = new Random();
        int num = rand.nextInt(3);
        while (num == mostRecentlyGenerated) {
            num = rand.nextInt(3);
        }

        mostRecentlyGenerated = num;

        //statusText.setText(num + "0");
        String[][] b1 = {
            {"2", "4", "7", "0", "9", "1", "0", "6", "8"},
            {"1", "0", "5", "7", "6", "0", "3", "0", "0"},
            {"8", "6", "0", "4", "0", "0", "0", "0", "7"},
            {"9", "0", "0", "2", "0", "6", "0", "0", "0"},
            {"0", "0", "0", "9", "4", "7", "6", "8", "0"},
            {"6", "0", "4", "0", "5", "0", "0", "1", "9"},
            {"7", "0", "0", "0", "3", "0", "9", "2", "0"},
            {"4", "0", "9", "6", "0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0", "0", "4", "0", "3"}
        };

        String[][] b2 = {
            {"0", "8", "0", "0", "1", "3", "4", "0", "0"},
            {"4", "2", "0", "6", "8", "0", "0", "0", "0"},
            {"0", "0", "1", "0", "5", "4", "0", "8", "3"},
            {"1", "9", "0", "0", "0", "8", "7", "0", "0"},
            {"0", "4", "7", "0", "0", "2", "5", "0", "8"},
            {"0", "5", "0", "0", "0", "9", "0", "3", "0"},
            {"2", "0", "9", "3", "0", "5", "0", "7", "0"},
            {"5", "0", "0", "7", "2", "0", "0", "0", "9"},
            {"7", "3", "0", "0", "0", "0", "2", "0", "6"}
        };
        String[][] b3 = {
            {"2", "0", "0", "0", "0", "0", "7", "8", "3"},
            {"0", "0", "0", "0", "0", "0", "0", "0", "5"},
            {"5", "0", "0", "0", "6", "0", "0", "9", "0"},
            {"6", "0", "4", "7", "0", "0", "3", "0", "0"},
            {"0", "1", "2", "0", "9", "0", "0", "0", "7"},
            {"0", "5", "0", "0", "0", "2", "0", "0", "1"},
            {"0", "0", "0", "9", "4", "0", "1", "0", "6"},
            {"9", "0", "0", "1", "3", "8", "5", "0", "0"},
            {"0", "0", "0", "0", "7", "0", "0", "4", "0"}
        };
        
        if(num == 0 )
            return convertBoardToString(b1);
        else if(num == 1)
             return convertBoardToString(b2);
        else 
            return convertBoardToString(b3);
        
        
	
	
    }
}
