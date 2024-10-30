package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει ως input απο τον χρήστη ένα
 * διψήφιο ακέραιο και έπειτα διαχωρίζει τον ακέραιο
 * και υπολογίζει το άθροισμα των δύο άριμών που προκύπτουν
 * απο τον διαχωρισμό.
 */
public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num1 = 0;
        int num2 = 0;
        int inputN;

        System.out.println("Give a two digit number");
        inputN = in.nextInt();
        num1 = inputN / 10; // με  διαιρεση παίρνουμε το αριστερό μερος
        num2 = inputN % 10; // με υπόλοιπο παίρνουμε το δεξί μεροσ
        sum = num1 + num2;

        System.out.printf("The sum is: %d", sum);

    }
}
