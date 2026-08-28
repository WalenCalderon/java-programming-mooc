
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un número; muestra el texto especial únicamente cuando el valor sea 1984.
 */
public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        if(number == 1984){
            System.out.println("Orwell");
        }
    }
}
