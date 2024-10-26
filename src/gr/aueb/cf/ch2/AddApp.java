package gr.aueb.cf.ch2;

/**
 * Calculation the sum of 2 integers
 * and the result is printed at console
 */
public class AddApp {
    public static void main(String[] args) {
        int num1 = 5 ;
        int num2 = 12 ;
        int result = 0;

        result = num1 + num2 ;
        System.out.println("The result is: " + result);
        System.out.printf("The sum of %d and %d is %d\n", num1, num2, result);
    }
}
