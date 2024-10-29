package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        int euro = 0;
        int dol = 0;
        int cent = 0;
        int totalUsaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Give Euro for Exchange (integer amount!)");
        euro = in.nextInt();
        totalUsaCents = euro * PARITY;
        dol = totalUsaCents / 100;
        cent = totalUsaCents % 100;

        // \u είναι για να εισάγουμε utf-8 χαρακτήρες.
        System.out.printf("%d\u20AC euros = \u0024%d usa dollars and %d usa cents", euro, dol, cent);
    }
}
