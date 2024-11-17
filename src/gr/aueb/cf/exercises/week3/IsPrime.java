package gr.aueb.cf.exercises.week3;

import java.util.Scanner;

/**
 *This App saying to us if one number is Prime or no.
 */
public class IsPrime {
    public static void main(String[] args) {
        int num = 0;
        boolean result = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give one number");
        num = sc.nextInt();

        result = isPrime(num);

        System.out.println("The number " + num + " is prime? " + result);

    }

    public static boolean isPrime(int num){
        
        if (num <= 1 ){
            return false;
        }
        if ( num == 2){
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 11 == 0 ){
            return false;
        } else return true;
        
    }

}
