
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un número y comunica si es positivo. El cero y los negativos deben recibir la respuesta contraria.
 */
public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        if(number > 0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is not positive.");
        }
    }
}
