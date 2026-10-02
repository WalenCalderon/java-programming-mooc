
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un entero y muestra su valor absoluto.
 */
public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.valueOf(scanner.nextLine()));
        System.out.println(num);

    }
}
