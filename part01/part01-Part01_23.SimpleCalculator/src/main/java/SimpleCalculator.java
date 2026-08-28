
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee dos números y muestra, en líneas separadas, su suma, diferencia, producto y cociente decimal.
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        int sum = first + second;
        int substraction = first - second;
        int multiplication = first * second;
        double division = 1.0 * first / second;
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + substraction);
        System.out.println(first + " * " + second + " = " + multiplication);
        System.out.println(first + " / " + second + " = " + division);


    }
}
