package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Demo of ternary operator on a common use case, that is conditional
 * assignment. abs(num) always positive
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("please enter a num");
        num = sc.nextInt();

        if (num >= 0) abs = num ;
        else abs = - num;

        // Ternary Operator
        abs = (num >= 0) ? num : - num; // this is the same with if else ? true : false

        System.out.println("The num is: " + abs);
    }
}
