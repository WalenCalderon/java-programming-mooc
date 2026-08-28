
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un inicio y un final; muestra la secuencia desde el inicio hasta el final cuando el intervalo sea válido.
 */
public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int end  = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from? ");
        int start = Integer.parseInt(scanner.nextLine());
        for (int i  = start; i <= end; i++) {
            System.out.println(i);
        }

    }
}
