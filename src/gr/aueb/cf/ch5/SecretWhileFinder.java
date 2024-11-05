package gr.aueb.cf.ch5;

import java.util.Scanner;

public class SecretWhileFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        do {

            System.out.println("Insert a num to guess the secret or 999 to end this game");
            num = sc.nextInt();

            if ((num == SECRET) || (num == 999)) {
                System.out.println("Secret number found!!!");
                isSuccess = true;
            } else {
                System.out.println("Try again!");
            }
        } while(!isSuccess);
    }
}
