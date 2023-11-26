package calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Multiplication extends Remote {

    public int mult(int x, int y) throws RemoteException;
}
