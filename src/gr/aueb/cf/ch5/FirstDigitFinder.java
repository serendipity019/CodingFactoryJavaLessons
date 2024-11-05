package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Βρίσκει το πρώτο ψηφίο ενός ακεραίου.
 */
public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;
        int leftNum = 0;


        System.out.println("Enter a positive number");
        inputNum = sc.nextInt();

        tempNum = inputNum;
        while(tempNum > 0){
            leftNum = tempNum;
            tempNum /= 10;
        }

        System.out.println("The primitive number is: " + leftNum);
    }
}
