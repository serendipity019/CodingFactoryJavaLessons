package gr.aueb.cf.ch12;

import java.util.Scanner;

/**
 * 153 = 1*3 + 5*3 + 3*3
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int numberOfDigits = 0;
        int originalNum = 0;
        int digit = 0;

        System.out.println("Please enter a number (integer)");
        num = sc.nextInt();
        numberOfDigits = String.valueOf(num).length();
        originalNum = num;

        while (num != 0){
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        System.out.printf("%d %s Armstrong ", originalNum, (sum == originalNum) ? " is" : "is not");
    }
}
