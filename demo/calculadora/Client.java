package calculadora;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9400);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n1. Adição\n2. Subtração\n3. Multiplicação\n4. Divisão\n5. Exit");
                System.out.println("\nEntre com a opção (número):");
                int option = scanner.nextInt();

                if (option == 5) {
                    break;
                }

                System.out.println("Para realizar os cálculos, entre com dois números.\nEntre com o primeiro número:");
                int first = scanner.nextInt();
                System.out.println("Entre com o segundo número:");
                int second = scanner.nextInt();

                switch (option) {
                    case 1:
                        Addition addition = (Addition) registry.lookup("Calculator");
                        System.out.println("Adição: " + first + " + " + second + " = " + addition.add(first, second));
                        break;
                    case 2:
                        Subtraction subtraction = (Subtraction) registry.lookup("Calculator");
                        System.out.println("Subtração: " + first + " - " + second + " = " + subtraction.sub(first, second));
                        break;
                    case 3:
                        Multiplication multiplication = (Multiplication) registry.lookup("Calculator");
                        System.out.println("Multiplicação: " + first + " * " + second + " = " + multiplication.mult(first, second));
                        break;
                    case 4:
                        Division division = (Division) registry.lookup("Calculator");
                        System.out.println("Divisão: " + first + " / " + second + " = " + division.div(first, second));
                        break;
                    default:
                        System.out.println("Entre com um valor válido");
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
        }
    }
}
