

/**
 * OBJETIVO DEL EJERCICIO:
 * Completa un método que reciba dos enteros y muestre su cociente como número decimal.
 */

import java.util.Scanner;
public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Once you have implemented the division method, you can
        // try it out here. For example division(3,5);
        // should print "0.6"
        System.out.println("Number of division:");
        int numerator = Integer.valueOf(scanner.nextLine());
        System.out.println("Denominator of division:");
        int denominator = Integer.valueOf(scanner.nextLine());
        // division(3, 5);
        division(numerator, denominator);
    }

    // implement the method here
    public static void division( int numerator, int denominator ){
        System.out.println("The result of division is: " + (double) numerator/denominator);

    }

}
