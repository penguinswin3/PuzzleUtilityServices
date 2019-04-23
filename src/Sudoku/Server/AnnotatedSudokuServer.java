
package Sudoku.Server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AnnotatedSudokuServer", targetNamespace = "Sudoku")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnnotatedSudokuServer {


    /**
     * 
     * @param checkBoardInput
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "checkBoardOut", targetNamespace = "Sudoku")
    @RequestWrapper(localName = "checkBoard", targetNamespace = "Sudoku", className = "Sudoku.Server.CheckBoard")
    @ResponseWrapper(localName = "checkBoardResponse", targetNamespace = "Sudoku", className = "Sudoku.Server.CheckBoardResponse")
    @Action(input = "Sudoku/AnnotatedSudokuServer/checkBoardRequest", output = "Sudoku/AnnotatedSudokuServer/checkBoardResponse")
    public String checkBoard(
        @WebParam(name = "checkBoardInput", targetNamespace = "Sudoku")
        String checkBoardInput);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "solveBoard", targetNamespace = "Sudoku", className = "Sudoku.Server.SolveBoard")
    @ResponseWrapper(localName = "solveBoardResponse", targetNamespace = "Sudoku", className = "Sudoku.Server.SolveBoardResponse")
    @Action(input = "Sudoku/AnnotatedSudokuServer/solveBoardRequest", output = "Sudoku/AnnotatedSudokuServer/solveBoardResponse")
    public String solveBoard();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generateBoard", targetNamespace = "Sudoku", className = "Sudoku.Server.GenerateBoard")
    @ResponseWrapper(localName = "generateBoardResponse", targetNamespace = "Sudoku", className = "Sudoku.Server.GenerateBoardResponse")
    @Action(input = "Sudoku/AnnotatedSudokuServer/generateBoardRequest", output = "Sudoku/AnnotatedSudokuServer/generateBoardResponse")
    public String generateBoard(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}