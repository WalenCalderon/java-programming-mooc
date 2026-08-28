
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee números hasta recibir 0 y cuenta solamente cuántos eran negativos.
 */
public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.println("Give a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0){
                break;
            }
            if(number < 0){
                count = count +1;

            }

        }
        System.out.println("Number of negative numbers: " + count);
    }
}
