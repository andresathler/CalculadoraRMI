package calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Division extends Remote {
    public int div(int x, int y) throws RemoteException;
}
