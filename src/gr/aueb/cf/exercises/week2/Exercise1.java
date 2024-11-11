package gr.aueb.cf.exercises.week2;

import java.util.Scanner;
/**
 * This program compute and tell us if 
 * an input year is disect or no. 
 */

public class Exercise1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = 0;

        System.out.println("Give the year please");
        year = sc.nextInt();

        if (((year % 4) == 0)  ) {
            if ((((year % 100) == 0)) && ((year % 400) != 0)) {
                System.out.println("This year isn't disect");
            } else {
                System.out.println("This year is disect");
            }
        }
    }
} 