
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Pide un valor verdadero o falso, conviértelo al tipo lógico y confirma el valor introducido.
 */
public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + value);

    }
}
