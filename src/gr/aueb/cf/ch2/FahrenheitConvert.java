package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * This App take from user a Fahrenheit value 
 * and convert to Celsius value
 */

 public class FahrenheitConvert { 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int fahrenheit;
        int celsius = 0;

        System.out.println("Give the Fahrenheit temperature!");
        fahrenheit = in.nextInt();
        celsius = 5 * (fahrenheit -32) / 9; 
        
        System.out.printf("The temperature is %d celsious points!\n", celsius);

   }
}