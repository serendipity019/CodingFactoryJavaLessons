package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα δύο ακεραίων με την χρήση μεθόδων.
 */
public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = 0;
        int sub = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two integers");
        a = sc.nextInt();
        b = sc.nextInt();

        sum = add(a,b);
        sub = AddApp.sub(a,b);

        System.out.println("The sum is: " + sum);
        System.out.println("The sub is: " + sub);
    }

    /**
     * Adds two integers
     * @param a the first integer
     * @param b the second integer
     * @return the sum of two integers
     */
    public static int add(int a, int b){
        int result = 0;

        result = a +b;

        return result;
    }

    public static int sub(int a, int b){
        return  a-b;
    }
}
