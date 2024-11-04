package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Snowing if raining AND temp < 0
 */
public class SnowingApp {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner sc = new Scanner(System.in);
        int temp = 0;

        System.out.println("Please insert if it is raining");
        isRaining = sc.nextBoolean();
        System.out.println("Please insert the temperature");
        temp = sc.nextInt();

        //isSnowing
        isSnowing = isRaining && (temp < 0);
        System.out.println("Is snowing: " + isSnowing);

    }
}
