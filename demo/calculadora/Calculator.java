package calculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject
        implements Addition, Division, Multiplication, Subtraction {

    public Calculator() throws RemoteException {}

    /**
     * @param x
     * @param y
     * @return x + y
     */
    @Override
    public int add(int x, int y) throws RemoteException {
        return x + y;
    }

    /**
     * @param x
     * @param y
     * @return x / y
     */
    @Override
    public double div(int x, int y) throws RemoteException {
        return (double) x / (double) y;
    }

    /**
     * @param x
     * @param y
     * @return x * y
     */
    @Override
    public int mult(int x, int y) throws RemoteException {
        return x * y;
    }

    /**
     * @param x
     * @param y
     * @return x - y
     */
    @Override
    public int sub(int x, int y) throws RemoteException {
        return x - y;
    }
}
