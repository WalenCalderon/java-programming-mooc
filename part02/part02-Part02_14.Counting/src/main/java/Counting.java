
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un límite y muestra todos los enteros desde 0 hasta ese límite, incluidos.
 */
public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }


    }
}
