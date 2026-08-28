
import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee una edad y acepta únicamente valores entre 0 y 120, incluidos; cualquier otro valor es imposible.
 */
public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int num = Integer.valueOf(scan.nextLine());
        if(num >= 0 && num <= 120){
            System.out.println("OK");
        } else{
            System.out.println("Impossible!");
        }
    }
}
