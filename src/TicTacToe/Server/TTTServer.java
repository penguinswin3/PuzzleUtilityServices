package TicTacToe.Server;

import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.Oneway;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.jws.soap.SOAPBinding.ParameterStyle;

@WebService(name            = "AnnotatedTTTServer",
            serviceName     = "RevisedTTTServer",
            targetNamespace = "http://TTT.tsa")
@SOAPBinding(style          = SOAPBinding.Style.DOCUMENT,
             use            = SOAPBinding.Use.LITERAL,
             parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class TTTServer 
{
    

    @WebMethod (operationName = "npcMove")
    public int npcMove(String[] board) 
    { 
         for(int i = 0; i < 9; i++)
         {
             if(board[i].equals(""))
             {
                 return i;
             }
         }
         return -1;
    }

    @WebMethod (operationName = "switchPlayer")
    public String switchPlayer(String player)
    {
        if(player.equals("X")) { return "O"; }
        else return "X";
    }
}