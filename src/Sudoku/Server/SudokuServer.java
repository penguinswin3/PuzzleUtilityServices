package Sudoku.Server;  // 'a' for 'annotation'

import java.util.Date;
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
             parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class SudokuServer {
    @WebMethod(operationName   = "checkBoard")
    @WebResult(name            = "checkBoardOut",
               targetNamespace = "Sudoku")
    public String checkBoard(
       @WebParam(name            = "checkBoardInput",
                 targetNamespace = "Sudoku",
                 mode            = WebParam.Mode.IN)
       String msg) {
        
        
        
        
        
        
          return "Boardstate: " + msg;
    }

    @WebMethod (operationName = "solveBoard")
    public String solveBoard() { return "Solved Board"; 
    
    
    
    
    
    
    
    }

    @WebMethod
    public String generateBoard(String msg) { return "Generated Board" + msg ; 
    
    
    
    
    
    }
}
