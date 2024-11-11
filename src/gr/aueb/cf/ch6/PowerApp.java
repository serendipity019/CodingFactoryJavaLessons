package gr.aueb.cf.ch6;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Calculates a^n.
 * e.g 2^10 = 1024.
 */
public class PowerApp {
    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int result = 1;
        Scanner sc = new Scanner(System.in);
        BigInteger bigResult = new BigInteger("1");

        System.out.println("Give the base");
        base = sc.nextInt();
        System.out.println("Give the power");
        power = sc.nextInt();
        for (int i = 1; i <= power; i++ ){
            result *= base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        System.out.println("The result is: " + result);
        System.out.println("The result is: " + bigResult);
    }
}
