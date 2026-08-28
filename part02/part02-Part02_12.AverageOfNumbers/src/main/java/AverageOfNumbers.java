/* To Do

Write a program that asks the user for input until the user inputs 0.
 After this, the program prints the average of the numbers.
 The number zero does not need to be counted to the average.
You may assume that the user inputs at least one number.
The average of the numbers can be calculated by dividing the sum of numbers with the amount of the numbers
*/
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee números hasta recibir 0 y calcula el promedio decimal de los valores anteriores.
 */
public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        double count = 0;
        while(true){
            System.out.println("Give a number: ");
            double number = Double.parseDouble(scanner.nextLine());
            if (number == 0){
                break;
            }
            sum += number;
            count++;
            avg = sum / count;
        }
        System.out.println("Average of the numbers: " + avg);
    }
}
