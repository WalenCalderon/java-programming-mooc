
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee números hasta recibir 0; al final muestra tanto la cantidad introducida como su suma.
 */
public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfValues = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if(number == 0){
                break;
            }
            sumOfValues += number;
            sumOfNumbers += 1;


        }
        System.out.println("Number of numbers: " + sumOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfValues);

    }
}
