
package Sudoku.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Sudoku.Server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenerateBoardResponse_QNAME = new QName("Sudoku", "generateBoardResponse");
    private final static QName _CheckBoard_QNAME = new QName("Sudoku", "checkBoard");
    private final static QName _SolveBoard_QNAME = new QName("Sudoku", "solveBoard");
    private final static QName _CheckBoardResponse_QNAME = new QName("Sudoku", "checkBoardResponse");
    private final static QName _SolveBoardResponse_QNAME = new QName("Sudoku", "solveBoardResponse");
    private final static QName _GenerateBoard_QNAME = new QName("Sudoku", "generateBoard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Sudoku.Server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolveBoard }
     * 
     */
    public SolveBoard createSolveBoard() {
        return new SolveBoard();
    }

    /**
     * Create an instance of {@link CheckBoard }
     * 
     */
    public CheckBoard createCheckBoard() {
        return new CheckBoard();
    }

    /**
     * Create an instance of {@link CheckBoardResponse }
     * 
     */
    public CheckBoardResponse createCheckBoardResponse() {
        return new CheckBoardResponse();
    }

    /**
     * Create an instance of {@link GenerateBoardResponse }
     * 
     */
    public GenerateBoardResponse createGenerateBoardResponse() {
        return new GenerateBoardResponse();
    }

    /**
     * Create an instance of {@link GenerateBoard }
     * 
     */
    public GenerateBoard createGenerateBoard() {
        return new GenerateBoard();
    }

    /**
     * Create an instance of {@link SolveBoardResponse }
     * 
     */
    public SolveBoardResponse createSolveBoardResponse() {
        return new SolveBoardResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "generateBoardResponse")
    public JAXBElement<GenerateBoardResponse> createGenerateBoardResponse(GenerateBoardResponse value) {
        return new JAXBElement<GenerateBoardResponse>(_GenerateBoardResponse_QNAME, GenerateBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "checkBoard")
    public JAXBElement<CheckBoard> createCheckBoard(CheckBoard value) {
        return new JAXBElement<CheckBoard>(_CheckBoard_QNAME, CheckBoard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolveBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "solveBoard")
    public JAXBElement<SolveBoard> createSolveBoard(SolveBoard value) {
        return new JAXBElement<SolveBoard>(_SolveBoard_QNAME, SolveBoard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "checkBoardResponse")
    public JAXBElement<CheckBoardResponse> createCheckBoardResponse(CheckBoardResponse value) {
        return new JAXBElement<CheckBoardResponse>(_CheckBoardResponse_QNAME, CheckBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolveBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "solveBoardResponse")
    public JAXBElement<SolveBoardResponse> createSolveBoardResponse(SolveBoardResponse value) {
        return new JAXBElement<SolveBoardResponse>(_SolveBoardResponse_QNAME, SolveBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "generateBoard")
    public JAXBElement<GenerateBoard> createGenerateBoard(GenerateBoard value) {
        return new JAXBElement<GenerateBoard>(_GenerateBoard_QNAME, GenerateBoard.class, null, value);
    }

}
