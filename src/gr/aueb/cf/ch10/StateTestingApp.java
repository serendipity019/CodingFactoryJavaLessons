package gr.aueb.cf.ch10;

import java.util.Scanner;

import static java.lang.System.in;

public class StateTestingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator");
        while (!sc.hasNextInt()){ // state-test
            System.out.println("Error. Input must be int. Please insert numerator");
            sc.nextLine();
        }
        numerator = sc.nextInt();

        System.out.println("Please insert denominator");
        while (!sc.hasNextInt()){ // state-test
            System.out.println("Error. Input must be int. Please insert denominator");
            sc.nextLine();
        }
        denominator = sc.nextInt();

        if(denominator == 0){ // state-test
            System.out.println("Error. Denominator must not be zero.");
            System.exit(1);
        }


        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n", numerator, denominator, result);
    }
}
