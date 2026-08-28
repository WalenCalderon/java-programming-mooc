
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee la velocidad; si supera 120, informa que se emitirá una multa. Si no la supera, no muestres ese aviso.
 */
public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        if(speed > 120 ){
            System.out.println("Speeding ticket!");

        }
    }
}
