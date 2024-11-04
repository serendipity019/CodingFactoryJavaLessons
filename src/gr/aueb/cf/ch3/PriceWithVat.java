package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the price with vat.
 */
public class PriceWithVat {
    public static void main(String[] args) {
        final double VAT = 0.24;
        double price = 0;
        double vatPrice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the price of the product");
        price = sc.nextDouble();

        vatPrice = price * (1 + VAT);

        System.out.printf("The price with Vat is: %.2f\n", vatPrice);

    }
}
