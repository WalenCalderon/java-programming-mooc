
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee en orden un texto, un entero, un decimal y un valor lógico; después confirma cada dato con el formato solicitado.
 */
public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int intenger = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double floatingPoint = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + intenger);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
