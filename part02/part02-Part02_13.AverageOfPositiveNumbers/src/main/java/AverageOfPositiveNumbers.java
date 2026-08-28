/*
Write a program that asks the user for input until the user inputs 0. After this, the program prints the average of the positive numbers (numbers that are greater than zero).
If no positive number is inputted, the program prints "Cannot calculate the average"
Below a few examples of the programs output
* */


import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee números hasta recibir 0 y calcula el promedio solo de los positivos; si no hubo positivos, informa que no puede calcularse.
 */
public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double avg = 0;

        while (true) {
            System.out.print("Enter a positive integer: ");
            double number = Double.parseDouble(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number > 0) {
                sum += number;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }else{
            avg = sum / count;
            System.out.println(avg);
        }
    }
}
