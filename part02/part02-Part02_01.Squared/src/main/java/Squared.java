
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un entero y muestra su cuadrado.
 */
public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextInt());
        int pw = num*num;
        System.out.println(pw);

    }
}
