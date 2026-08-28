
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Construye la conversación guiada: muestra una pregunta, lee la respuesta, muestra la segunda pregunta, lee otra respuesta y despídete.
 */
public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Greetings! How are you doing?");
        String first = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String second = scanner.nextLine();
        System.out.println("Thanks for sharing!");

    }
}
