
/**
 * OBJETIVO DEL EJERCICIO:
 * Completa un método de suma y úsalo desde otro método para devolver el promedio decimal de cuatro enteros.
 */
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        int summed = sum(number1, number2, number3, number4);
        double average = (double) summed / 4;
        return average;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
