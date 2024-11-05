package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Exist a secret integer number and the user with one
 * attemp will try to find it.
 */
public class SecretFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret");
        num = sc.nextInt();

        if(num == SECRET){
            System.out.println("Secret number found!!!");
        } else {
            System.out.println("Failure");
        }
    }
}
