
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Pregunta repetidamente si se debe continuar. Termina únicamente cuando el usuario responda que no.
 */
public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Shall we carry on?");
            String carryOn = scanner.nextLine();
            if (carryOn.equals("no")) {
                break;
            }
        }

    }
}
