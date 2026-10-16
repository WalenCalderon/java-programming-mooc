

/**
 * OBJETIVO DEL EJERCICIO:
 * Completa un método que reciba un inicio y muestre los enteros descendiendo desde ese valor hasta 1.
 */
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number){
        for (int i = number; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
