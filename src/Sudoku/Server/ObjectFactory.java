
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
    private final static QName _SbResponse_QNAME = new QName("Sudoku", "sbResponse");
    private final static QName _VerifyUniqueResponse_QNAME = new QName("Sudoku", "verifyUniqueResponse");
    private final static QName _CheckBoardInput_QNAME = new QName("Sudoku", "checkBoardInput");
    private final static QName _CheckBoardResponse_QNAME = new QName("Sudoku", "checkBoardResponse");
    private final static QName _VerifyUnique_QNAME = new QName("Sudoku", "verifyUnique");
    private final static QName _SolveBoardResponse_QNAME = new QName("Sudoku", "solveBoardResponse");
    private final static QName _Cb_QNAME = new QName("Sudoku", "cb");
    private final static QName _Sb_QNAME = new QName("Sudoku", "sb");
    private final static QName _GenerateBoard_QNAME = new QName("Sudoku", "generateBoard");
    private final static QName _CbResponse_QNAME = new QName("Sudoku", "cbResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Sudoku.Server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IntArray }
     * 
     */
    public IntArray createIntArray() {
        return new IntArray();
    }

    /**
     * Create an instance of {@link IntArrayArray }
     * 
     */
    public IntArrayArray createIntArrayArray() {
        return new IntArrayArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "generateBoardResponse")
    public JAXBElement<String> createGenerateBoardResponse(String value) {
        return new JAXBElement<String>(_GenerateBoardResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "sbResponse")
    public JAXBElement<Boolean> createSbResponse(Boolean value) {
        return new JAXBElement<Boolean>(_SbResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "verifyUniqueResponse")
    public JAXBElement<Boolean> createVerifyUniqueResponse(Boolean value) {
        return new JAXBElement<Boolean>(_VerifyUniqueResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "checkBoardInput")
    public JAXBElement<String> createCheckBoardInput(String value) {
        return new JAXBElement<String>(_CheckBoardInput_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "checkBoardResponse")
    public JAXBElement<String> createCheckBoardResponse(String value) {
        return new JAXBElement<String>(_CheckBoardResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "verifyUnique")
    public JAXBElement<IntArray> createVerifyUnique(IntArray value) {
        return new JAXBElement<IntArray>(_VerifyUnique_QNAME, IntArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "solveBoardResponse")
    public JAXBElement<String> createSolveBoardResponse(String value) {
        return new JAXBElement<String>(_SolveBoardResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntArrayArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "cb")
    public JAXBElement<IntArrayArray> createCb(IntArrayArray value) {
        return new JAXBElement<IntArrayArray>(_Cb_QNAME, IntArrayArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntArrayArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "sb")
    public JAXBElement<IntArrayArray> createSb(IntArrayArray value) {
        return new JAXBElement<IntArrayArray>(_Sb_QNAME, IntArrayArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "generateBoard")
    public JAXBElement<String> createGenerateBoard(String value) {
        return new JAXBElement<String>(_GenerateBoard_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Sudoku", name = "cbResponse")
    public JAXBElement<Boolean> createCbResponse(Boolean value) {
        return new JAXBElement<Boolean>(_CbResponse_QNAME, Boolean.class, null, value);
    }

}
