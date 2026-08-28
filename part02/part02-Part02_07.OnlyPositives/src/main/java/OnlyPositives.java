import java.util.Scanner;

/**
 * OBJETIVO DEL EJERCICIO:
 * Lee números repetidamente. Para cada positivo muestra su cuadrado; termina al recibir un número negativo.
 */
public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if(number<0){
                System.out.println("Unsuitable number");
                continue;
            } else if(number==0){
                break;
            }else {
                System.out.println("You input " + number*number);
            }

        }

    }
}
