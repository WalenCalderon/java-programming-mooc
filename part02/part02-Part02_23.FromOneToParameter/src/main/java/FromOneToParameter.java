

/**
 * OBJETIVO DEL EJERCICIO:
 * Completa un método que reciba un límite y muestre los enteros desde 1 hasta ese límite.
 */
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        for(int i = 1; i <= number; i++){
            System.out.println(i);
        }
    }

}
