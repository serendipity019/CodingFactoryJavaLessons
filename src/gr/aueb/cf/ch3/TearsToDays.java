package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Convert years (ages) to days
 */
public class TearsToDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        System.out.println("Please insert your age");
        age = sc.nextInt();

        days = age * DAYS_PER_YEAR;

        System.out.printf("Age in years: %d, Age in days: %d", age, days);
    }
}
