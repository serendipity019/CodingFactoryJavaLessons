package gr.aueb.cf.exercises.week3;

import java.util.Scanner;

/**
 * This App calculate the square power.
 * Use method for the calqulation.
 */

public class SquareMethod {
    public static void main(String[] args){
        int num = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give one number");
        num = sc.nextInt();

        result = square(num);

        System.out.println("The square of " + num + " is " + result);

    }

    public static int square(int num){
        return num * num ; 
    }

}
