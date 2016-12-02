package ChatProgram;

import java.rmi.*;

public interface MyRemoteInterface extends Remote{
    void printMessage(String msg) throws RemoteException;
}
