package Sudoku.Server;

import javax.xml.ws.Endpoint;

public class SudokuPublisher_Created {
    public static void main(String[ ] args) {
      Endpoint.publish("http://127.0.0.1:9876/Sudoku", new SudokuServer_Created());
      System.out.println("Service Published");
    }
}
