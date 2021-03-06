
package Sudoku.Server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AnnotatedSudokuServer", targetNamespace = "Sudoku")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnnotatedSudokuServer {


    /**
     * 
     * @param cb
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "cbResponse", targetNamespace = "Sudoku", partName = "cbResponse")
    @Action(input = "Sudoku/AnnotatedSudokuServer/cbRequest", output = "Sudoku/AnnotatedSudokuServer/cbResponse")
    public boolean cb(
        @WebParam(name = "cb", targetNamespace = "Sudoku", partName = "cb")
        IntArrayArray cb);

    /**
     * 
     * @param checkBoardInput
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "checkBoardResponse", targetNamespace = "Sudoku", partName = "checkBoardResponse")
    @Action(input = "Sudoku/AnnotatedSudokuServer/checkBoardRequest", output = "Sudoku/AnnotatedSudokuServer/checkBoardResponse")
    public String checkBoard(
        @WebParam(name = "checkBoardInput", targetNamespace = "Sudoku", partName = "checkBoardInput")
        String checkBoardInput);

    /**
     * 
     * @param verifyUnique
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "verifyUniqueResponse", targetNamespace = "Sudoku", partName = "verifyUniqueResponse")
    @Action(input = "Sudoku/AnnotatedSudokuServer/verifyUniqueRequest", output = "Sudoku/AnnotatedSudokuServer/verifyUniqueResponse")
    public boolean verifyUnique(
        @WebParam(name = "verifyUnique", targetNamespace = "Sudoku", partName = "verifyUnique")
        IntArray verifyUnique);

    /**
     * 
     * @param checkBoardInput
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "solveBoardResponse", targetNamespace = "Sudoku", partName = "solveBoardResponse")
    @Action(input = "Sudoku/AnnotatedSudokuServer/solveBoardRequest", output = "Sudoku/AnnotatedSudokuServer/solveBoardResponse")
    public String solveBoard(
        @WebParam(name = "checkBoardInput", targetNamespace = "Sudoku", partName = "checkBoardInput")
        String checkBoardInput);

    /**
     * 
     * @param sb
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "sbResponse", targetNamespace = "Sudoku", partName = "sbResponse")
    @Action(input = "Sudoku/AnnotatedSudokuServer/sbRequest", output = "Sudoku/AnnotatedSudokuServer/sbResponse")
    public boolean sb(
        @WebParam(name = "sb", targetNamespace = "Sudoku", partName = "sb")
        IntArrayArray sb);

    /**
     * 
     * @param generateBoard
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "generateBoardResponse", targetNamespace = "Sudoku", partName = "generateBoardResponse")
    @Action(input = "Sudoku/AnnotatedSudokuServer/generateBoardRequest", output = "Sudoku/AnnotatedSudokuServer/generateBoardResponse")
    public String generateBoard(
        @WebParam(name = "generateBoard", targetNamespace = "Sudoku", partName = "generateBoard")
        String generateBoard);

}
