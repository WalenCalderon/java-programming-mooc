
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Pide números repetidamente y detén el programa cuando el usuario introduzca 4.
 */
public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number: ");
            int command = Integer.valueOf(scanner.nextLine());
            if(command==4){
                break;
            }
            System.out.println("You input " + command);
        }
    }
}
