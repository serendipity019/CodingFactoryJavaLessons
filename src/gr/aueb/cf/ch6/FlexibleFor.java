package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Throughout
 demo of for.
 */
public class FlexibleFor {
    public static void main(String[] args) {
        int startVal = 0;
        int endVal = 0;
        int step = 0;
        Scanner sc = new Scanner(System.in);
        int iterations = 0;

        System.out.println("Please enter start point");
        startVal = sc.nextInt();
        System.out.println("Please enter end point");
        endVal = sc.nextInt();
        System.out.println("Please enter step point");
        step = sc.nextInt();

        for (int i = startVal; i <= endVal; i += step){
            iterations++;
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Iterations: " + iterations);
    }
}
