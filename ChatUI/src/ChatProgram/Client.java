package ChatProgram;

import java.rmi.registry.*;

public class Client {

    public static void message(String ip, int port, String message) throws Exception {

        Registry reg = LocateRegistry.getRegistry(ip, port) ;
        MyRemoteInterface handle = (MyRemoteInterface) reg.lookup("myrmiserver");

        System.out.print("> ");
        
        handle.printMessage(message);

    }
}