package gr.aueb.cf.exercises.week3;

import java.util.Scanner;

/**
 * This app take 3 integrals and find the bigger of them. 
 */

public class FindMax {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give three numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        result = findMax(num1, num2, num3);

        System.out.println("The bigger number between " + num1 + ", " + num2 + ", " + num3 +  " is " + result);
    }

    public static int findMax(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2), num3);
    }

}
