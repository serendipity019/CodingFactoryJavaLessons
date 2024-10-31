package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * This Program read from the user 3 integers 
 * that is day, month, year and appear them
 * in dd/mm/yy format
 */

 public class Date{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Give 3 integers, one for the day, one for the month, one for the year.");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("%02d/%02d/%02d\n", day, month, (year%1000)%100);


    }
 }

