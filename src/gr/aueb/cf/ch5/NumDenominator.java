package gr.aueb.cf.ch5;

/**
 * This App make continously division until the user give 0 as numerator
 */

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true){
            System.out.println("Please insert numerator (Quit with numerator = 0)");
            numerator = sc.nextInt();

            if(numerator == 0){
                System.out.println("Numerator is zero. Quiting...");
                break;
            }

            System.out.println("please insert denominator");
            denominator = sc.nextInt();

            if (denominator == 0){
                System.out.println("Denominator must not be zero");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result " + result);
        }
    }
}
