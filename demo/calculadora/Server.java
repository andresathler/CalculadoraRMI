package calculadora;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Criar o objeto Calculator
            Calculator calculator = new Calculator();

            // Criar o registro RMI na porta 9400
            Registry registry = LocateRegistry.createRegistry(9400);

            // Vincular o objeto Calculator ao registro com o nome "Calculator"
            registry.bind("Calculator", calculator);

            System.out.println("Server started on port 9400");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
