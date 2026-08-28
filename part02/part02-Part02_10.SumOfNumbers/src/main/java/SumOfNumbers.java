
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee números hasta recibir 0 y muestra la suma de todos los valores anteriores.
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if(num == 0 ){
                break;
            }
        }
        System.out.println("Sum of the numbers: " + sum);

    }
}
