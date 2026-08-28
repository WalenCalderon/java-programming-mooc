
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Determina si un año es bisiesto: divisible entre 4, salvo los divisibles entre 100 que no sean también divisibles entre 400.
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        if((year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0){
            System.out.println("The year is a leap year.");
        } else{
            System.out.println("The year is not a leap year.");
        }

    }
}
