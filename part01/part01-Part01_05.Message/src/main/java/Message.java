
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Pide un mensaje, lee una línea completa del usuario y muestra exactamente el mismo mensaje.
 */
public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String message = scanner.nextLine();
        System.out.println(message);


    }
}
