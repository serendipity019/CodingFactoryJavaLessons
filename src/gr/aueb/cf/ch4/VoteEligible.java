package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου έχουν όσοι είναι μεγαλύτεροι των 18.
 * Ελέγχει αν μια ηλικία έχει δικαίωμα να ψηφίσει.
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isEligible = false;
        int age = 0;

        System.out.println("Give your age please");
        age = sc.nextInt();

        isEligible = (age >= 18);

        System.out.printf("Permision for vote: %b", isEligible);

    }
}
