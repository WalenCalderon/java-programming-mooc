
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un número y calcula su factorial multiplicando los enteros desde 1 hasta ese valor.
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int num = Integer.parseInt(scanner.nextLine());

        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
