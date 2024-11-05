package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας ακαίρεος είναι άρτιος.
 */
public class IsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        System.out.println("Please insert a number (integer)");
        num = sc.nextInt();

        isEven = num % 2 == 0;

        System.out.printf("%d is even: %b ", num, isEven);
    }
}
