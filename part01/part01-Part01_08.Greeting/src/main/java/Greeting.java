
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Pregunta el nombre, léelo y muestra un saludo personalizado usando ese valor.
 */
public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);

    }
}
