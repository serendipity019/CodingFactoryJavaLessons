package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Give as output the multiplication of a decimal number
 * that give the user with all others decimals numbers 1-10
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int mult = 0;

        System.out.println("Give an integer number for multiplication");
        inputNum = sc.nextInt();

        int i = 1;
        while (i <= 10){
            mult = inputNum * i;
            System.out.println(i + " times " + inputNum + " equal " + mult );
            i++;
        }
    }
}
