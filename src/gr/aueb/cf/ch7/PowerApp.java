package gr.aueb.cf.ch7;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        long base = 0L;
        long power = 0L;
        long result = 0L;
        System.out.println("Give the base");
        base = getOneLong();
        System.out.println("Give the power");
        power = getOneLong();

        result = pow(base,power);
        System.out.println("The result is: " + result);
    }

    /**
     * Calculates a^n.
     * @param a the base.
     * @param n the power.
     * @return the base raised to the power.
     */
    public static long pow(long a, long n){
        long result = 1L;
        for( int i = 1; i <= n; i++){
            result *= a;
        }
        return result;
        // return (long) Math.pow(a, n);
    }

    public static long getOneLong(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }
}
