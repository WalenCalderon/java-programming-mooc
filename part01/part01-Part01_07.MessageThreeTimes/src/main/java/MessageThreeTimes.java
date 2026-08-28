
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un mensaje una sola vez y muéstralo tres veces, cada repetición en su propia línea.
 */
public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String message = scanner.nextLine();
        for(int i = 0; i<3;i++){
            System.out.println(message);
        }
    }
}
