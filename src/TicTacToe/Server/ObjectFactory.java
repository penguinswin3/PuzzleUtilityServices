
package TicTacToe.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the TicTacToe.Server package. 
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

    private final static QName _NpcMoveResponse_QNAME = new QName("http://TTT.tsa", "npcMoveResponse");
    private final static QName _SwitchPlayer_QNAME = new QName("http://TTT.tsa", "switchPlayer");
    private final static QName _SwitchPlayerResponse_QNAME = new QName("http://TTT.tsa", "switchPlayerResponse");
    private final static QName _NpcMove_QNAME = new QName("http://TTT.tsa", "npcMove");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: TicTacToe.Server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SwitchPlayerResponse }
     * 
     */
    public SwitchPlayerResponse createSwitchPlayerResponse() {
        return new SwitchPlayerResponse();
    }

    /**
     * Create an instance of {@link NpcMove }
     * 
     */
    public NpcMove createNpcMove() {
        return new NpcMove();
    }

    /**
     * Create an instance of {@link SwitchPlayer }
     * 
     */
    public SwitchPlayer createSwitchPlayer() {
        return new SwitchPlayer();
    }

    /**
     * Create an instance of {@link NpcMoveResponse }
     * 
     */
    public NpcMoveResponse createNpcMoveResponse() {
        return new NpcMoveResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NpcMoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TTT.tsa", name = "npcMoveResponse")
    public JAXBElement<NpcMoveResponse> createNpcMoveResponse(NpcMoveResponse value) {
        return new JAXBElement<NpcMoveResponse>(_NpcMoveResponse_QNAME, NpcMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwitchPlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TTT.tsa", name = "switchPlayer")
    public JAXBElement<SwitchPlayer> createSwitchPlayer(SwitchPlayer value) {
        return new JAXBElement<SwitchPlayer>(_SwitchPlayer_QNAME, SwitchPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwitchPlayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TTT.tsa", name = "switchPlayerResponse")
    public JAXBElement<SwitchPlayerResponse> createSwitchPlayerResponse(SwitchPlayerResponse value) {
        return new JAXBElement<SwitchPlayerResponse>(_SwitchPlayerResponse_QNAME, SwitchPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NpcMove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TTT.tsa", name = "npcMove")
    public JAXBElement<NpcMove> createNpcMove(NpcMove value) {
        return new JAXBElement<NpcMove>(_NpcMove_QNAME, NpcMove.class, null, value);
    }

}
