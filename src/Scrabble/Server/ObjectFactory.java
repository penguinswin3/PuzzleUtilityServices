
package Scrabble.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Scrabble.Server package. 
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

    private final static QName _ScrabbleResponse_QNAME = new QName("http://PuzzleUtilityURI.org/", "ScrabbleResponse");
    private final static QName _ScrabbleCheckBoard_QNAME = new QName("http://PuzzleUtilityURI.org/", "Scrabble_CheckBoard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Scrabble.Server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScrabbleCheckBoard }
     * 
     */
    public ScrabbleCheckBoard createScrabbleCheckBoard() {
        return new ScrabbleCheckBoard();
    }

    /**
     * Create an instance of {@link ScrabbleResponse }
     * 
     */
    public ScrabbleResponse createScrabbleResponse() {
        return new ScrabbleResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScrabbleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PuzzleUtilityURI.org/", name = "ScrabbleResponse")
    public JAXBElement<ScrabbleResponse> createScrabbleResponse(ScrabbleResponse value) {
        return new JAXBElement<ScrabbleResponse>(_ScrabbleResponse_QNAME, ScrabbleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScrabbleCheckBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PuzzleUtilityURI.org/", name = "Scrabble_CheckBoard")
    public JAXBElement<ScrabbleCheckBoard> createScrabbleCheckBoard(ScrabbleCheckBoard value) {
        return new JAXBElement<ScrabbleCheckBoard>(_ScrabbleCheckBoard_QNAME, ScrabbleCheckBoard.class, null, value);
    }

}
