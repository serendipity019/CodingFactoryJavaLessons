package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Compute a^power
 */
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Insert base");
        base = sc.nextInt();
        System.out.println("Insert power");
        power = sc.nextInt();

        int i = 1;
        while (i <= power){
            result *= base;
            i++;
        }

        System.out.println("Result: " + result);
    }
}
