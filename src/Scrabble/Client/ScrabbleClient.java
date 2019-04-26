package Scrabble.Client;

import Scrabble.Server.ScrabbleResponse;
import Scrabble.Server.CheckGame;

class SudokuClient {
    public static void main(String[ ] args) {
        ScrabbleResponse server = new ScrabbleResponse();
        //CheckGame scrabbleService = new CheckGame();

        System.out.println(server.getBooleanRequest());

    }
}    
