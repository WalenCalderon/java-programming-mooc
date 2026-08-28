
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee el inicio y el final de un intervalo y calcula la suma de todos sus enteros.
 */
public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number");
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number");
        int lastNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = firstNum; i <= lastNum; i++){
            sum += i;
        }
        System.out.println("sum is " + sum);

    }
}
