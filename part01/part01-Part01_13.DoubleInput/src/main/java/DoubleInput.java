
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Pide un número decimal, conviértelo al tipo adecuado y confirma el valor introducido.
 */
public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number: ");
        double value = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + value);
    }
}
