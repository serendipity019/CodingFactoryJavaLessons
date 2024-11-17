package gr.aueb.cf.exercises.week3;

import java.util.Scanner;

/**
 * This App take the temperature in Celsius and convert to Fahrenheit.
 */
public class FahrenheitConvert {
        public static void main(String[] args) {
            double celsius = 0.0;
            double result = 0.0;
            Scanner sc = new Scanner(System.in);

            System.out.println("Give the temperature");
            celsius = sc.nextDouble();

            result = fahrenheitConvert(celsius);

            System.out.printf("The tempereture in Fahrenheit is: %.1f\n", result );

        }

        public static double fahrenheitConvert(double celsius){
            return ((celsius / 5) * 9) + 32 ;
        }

}
