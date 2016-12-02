package ChatProgram;

import java.rmi.registry.*;

public class Client {

    public static void message(String ip, int port, String message, String name) throws Exception {

        Registry reg = LocateRegistry.getRegistry(ip, port) ;
        MyRemoteInterface handle = (MyRemoteInterface) reg.lookup("myrmiserver");

        //handle.printMessage(name);
        //handle.printMessage(message);
        
        
        UI.jTextArea1.setText(UI.jTextArea1.getText() + UI.jTextField4.getText() + " > " + message + "\n");
    }
}