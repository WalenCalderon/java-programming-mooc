
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un límite y calcula la suma de todos los enteros desde 1 hasta ese límite.
 */
public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number: ");
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= num; i++ ) {
            //pienso que en algo como esto
            sum += i;
        }
        System.out.println(sum);

    }
}
