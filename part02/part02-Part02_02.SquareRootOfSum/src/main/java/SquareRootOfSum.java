
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee dos enteros, súmalos y muestra la raíz cuadrada de esa suma.
 */
public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter the second number:");
        double num2 = Double.valueOf(scanner.nextLine());

        double squareRoot = Math.sqrt(num2+num1);
        System.out.println(squareRoot);

    }
}
