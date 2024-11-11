package gr.aueb.cf.ch6;

import java.util.Scanner;
import java.io.IOException;
/**
 * Reads a char as a byte.
 */
public class CharInApp {
    public static void main(String[] args) {
        char ch = ' ';
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        // 2 options read and output
        //ch = (char) System.in.read(); //this option don't work to me, i take error
        ch = sc.nextLine().charAt(0);

        System.out.printf("%c", ch);
    }
}
