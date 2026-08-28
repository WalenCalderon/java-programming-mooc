
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee dos números y muestra una operación de multiplicación completa: ambos operandos y el resultado.
 */
public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        int product = first * second;
        System.out.println(first + " * " + second + " = " + product);
    }
}
