
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un número inicial y muestra todos los enteros desde ese valor hasta 100, incluidos.
 */
public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = num; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
