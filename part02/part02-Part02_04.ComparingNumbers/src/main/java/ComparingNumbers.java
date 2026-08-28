
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee dos enteros y comunica si el primero es mayor, el segundo es mayor o ambos son iguales.
 */
public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        if(first>second){
            System.out.println( first + "is greater than " + second );

        } else if (first < second){
            System.out.println(first + "is smaller than " + second);
        } else{
            System.out.println(first + "Is equal to " + second);
        }

    }
}
