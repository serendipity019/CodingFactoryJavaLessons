package gr.aueb.cf.ch9;

/**
 * IO in strings
 */

import java.util.Scanner;

public class IOStrApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings");
        s1 = sc.next(); //Διαβάζει μέχρι να βρεί whitespace (spaces, \t, \n)
        s2 = sc.nextLine(); //Διαβάζει μέχρι να βρεί \n

        System.out.printf("s1: %s\n", s1);
        System.out.printf("s2: %s\n", s2);
    }
}
