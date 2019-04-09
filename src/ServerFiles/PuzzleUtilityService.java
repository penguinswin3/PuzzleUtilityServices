package ServerFiles;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(name = "PuzzleUtilityService", targetNamespace = "http://PuzzleUtilityURI.org/")

public class PuzzleUtilityService {
    @WebMethod(operationName = "Sudoku_CheckGame",
               action = "http://PuzzleUtilityURI.org/Sudoku_CheckGame")
    @WebResult(name = "booleanResult",
               targetNamespace = "http://PuzzleUtilityURI.org/")
    @RequestWrapper(localName = "Sudoku_CheckGame",
                    targetNamespace = "http://PuzzleUtilityURI.org/",
                    className = "ServerFiles.Sudoku_CheckGame")
    @ResponseWrapper(localName = "c2fResponse",
                     targetNamespace = "http://tempConvertURI.org/",
                     className = "ch02.TempConvService.C2FResponse")
   
    
    public double c2F(
        @WebParam(name = "t",
                  targetNamespace = "http://tempConvertURI.org/")
        double t) { return 32.0 + (t * 9.0 / 5.0); }

    @WebMethod(operationName = "f2c",
               action = "http://tempConvertURI.org/f2c")
    @WebResult(name = "f2cResult",
               targetNamespace = "http://tempConvertURI.org/")
    @RequestWrapper(localName = "f2c",
                    targetNamespace = "http://tempConvertURI.org/",
                    className = "ch02.TempConvService.F2C")
    @ResponseWrapper(localName = "f2cResponse",
                     targetNamespace = "http://tempConvertURI.org/",
                     className = "ch02.TempConvService.F2CResponse")
    
    
    public double f2C(
        @WebParam(name = "t",
                  targetNamespace = "http://tempConvertURI.org/")
        double t) { return (5.0 / 9.0) * (t - 32.0); }

}      
