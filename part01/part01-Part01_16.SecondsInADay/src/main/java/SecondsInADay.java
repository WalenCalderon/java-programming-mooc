
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee una cantidad de días, calcula cuántos segundos contienen y muestra el resultado.
 */
public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int value = Integer.valueOf(scanner.nextLine());
        value = (value * 24)* 60 * 60;
        System.out.println(value);


    }
}
