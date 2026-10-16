
import java.util.Scanner;
/**
 * OBJETIVO DEL EJERCICIO:
 * Completa un método que reciba dos límites y muestre todos los números divisibles entre 3 dentro del intervalo, incluidos.
 */
public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a begining number: ");
        int begining =  Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a ending number: ");
        int ending = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(begining, ending);
    }

    public static void  divisibleByThreeInRange(int begining, int ending) {
        if (begining == 0 || ending == 0) {
            System.out.println("Invalid input");
        }
        for  (int i = begining; i <= ending; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

}
