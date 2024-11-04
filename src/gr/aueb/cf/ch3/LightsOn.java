package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining AND car is running (>100) Or is Dark.
 */
public class LightsOn {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isDark = false;
        boolean areLightsOn = false;
        Scanner sc = new Scanner(System.in);
        int carSpeed = 0;

        System.out.println("Please insert if it is raining");
        isRaining = sc.nextBoolean();
        System.out.println("Please insert the car speed");
        carSpeed = sc.nextInt();
        System.out.println("Please insert if it is dark");
        isDark = sc.nextBoolean();

        //areLightsOn
        areLightsOn = isRaining && ((carSpeed > 100) || isDark);
        System.out.println("Turn lights on: " + areLightsOn);
    }
}
