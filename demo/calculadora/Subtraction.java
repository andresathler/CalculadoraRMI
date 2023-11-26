package calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Subtraction extends Remote {

    public int sub(int x, int y) throws RemoteException;
}
