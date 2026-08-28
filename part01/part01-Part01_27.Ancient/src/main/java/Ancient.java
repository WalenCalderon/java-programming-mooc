
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee un año; si es anterior a 2015, muestra el aviso de historia antigua.
 */
public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        if(year < 2015){
            System.out.println("Ancient!");
        }
    }
}
