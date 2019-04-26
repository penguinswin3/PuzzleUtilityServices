package TicTacToe.Server;
import javax.xml.ws.Endpoint;

public class TTTPublisher {
    public static void main(String[ ] args) {
      Endpoint.publish("http://127.0.0.1:9876/TTT", new TTTServer());
    }
}