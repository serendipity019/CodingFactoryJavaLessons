package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το αθροισμα των άρτιων απο το 2 μέχρι ένα όριο που δίνει
 * ο χρήστης.
 */
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;

        System.out.println("Please insert upper limit");
        inputNum = sc.nextInt();

        int i = 2;
        while (i <= inputNum){
            sum += i;
            i += 2;
        }

        System.out.println("Sum is: " + sum);
    }
}
