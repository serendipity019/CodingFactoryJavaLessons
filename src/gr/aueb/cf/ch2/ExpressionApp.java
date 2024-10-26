package gr.aueb.cf.ch2;

public class ExpressionApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("The sum of %d with the %d is: %d\n", num1, num2, sum );
        System.out.printf("The subtract of %d with the %d is: %d\n", num1, num2, sub );
        System.out.printf("The multiply of %d with the %d is: %d\n", num1, num2, mul );
        System.out.printf("The division of %d with the %d is: %d\n", num1, num2, div );
        System.out.printf("The Modular of %d with the %d is: %d\n", num1, num2, mod );
    }
}
