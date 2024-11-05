package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Αντιστρέφει ένα ακέραιο. Για παράδειγμα,
 * το 123 γίνεται 321.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int reversed = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer");
        inputNum = sc.nextInt();

        tempNum = inputNum;
        while (tempNum > 0){
            rightDigit = tempNum % 10;
            reversed = reversed * 10 + rightDigit;
            tempNum /= 10;
        }

        System.out.println("The reversed number is: " + reversed);
    }
}
