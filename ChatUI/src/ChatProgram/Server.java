package ChatProgram;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class Server extends UnicastRemoteObject implements MyRemoteInterface{
    
    //This function is what we want the client to access
    @Override
    public void printMessage(String msg) throws RemoteException{
        UI.jTextArea1.setText(UI.jTextArea1.getText() + UI.jTextField4.getText() + " > " + msg + "\n");

    }
    
    public static void start(int port) throws Exception{
        Server server = new Server(); //Create the server
        
        Registry reg = LocateRegistry.createRegistry(port);//The port to connect
        reg.bind("myrmiserver", server); //This adds the server to the reg
                                         //with the name "myrmiserver"
    }
    
    //This is needed because of the unicast remote object
    public Server() throws RemoteException{} 
    
}
