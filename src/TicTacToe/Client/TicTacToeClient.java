package TicTacToe.Client;

import TicTacToe.Server.RevisedTTTServer;
import TicTacToe.Server.AnnotatedTTTServer;

class TicTacToeClient 
{
    @SuppressWarnings("empty-statement")
    public static void main(String[ ] args) 
    {
        RevisedTTTServer ts = new RevisedTTTServer();
        AnnotatedTTTServer ats = ts.getAnnotatedTTTServerPort();
   
    }
}    
