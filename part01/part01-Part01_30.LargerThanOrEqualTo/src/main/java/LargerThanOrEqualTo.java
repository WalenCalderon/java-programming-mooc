
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee dos enteros y muestra cuál es mayor; si coinciden, indica que son iguales.
 */
public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scan.nextLine());
        if(first > second){
            System.out.println("Greater number is: " + first);
        } else if(second > first){
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
