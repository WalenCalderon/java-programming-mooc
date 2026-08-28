
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee la edad y comunica si la persona tiene al menos 18 años.
 */
public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here \
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        if(age >= 18){
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

    }
}
