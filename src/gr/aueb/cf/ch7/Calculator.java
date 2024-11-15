package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Appear a menu of choice( 1. add 2. sub, ...)
 * The user chose.
 * Work continuously until the user chose exit.
 */
public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result = 0;

        while (true){
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)){
                System.out.println("Error. Choice must be between 1-6. Try again.");
                continue;
            }

            if (choice == 6){
                System.out.println("Εξοδος...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα απο τα παρακάτω:");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6. Εξοδος");
    }

    public static int getOneInt(){
        return sc.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        //if (choice >=1 && choice <= 6){
         //   return true;
       // } else {
           // return false;
       // }

        return choice >=1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε δύο ακέραιους");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice){
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Eξοδος...");
                break;

        }
        return result;
    }

    public static int add(int a, int b){
        int result = 0;

        result = a + b;

        return result;
    }

    public static int sub(int a, int b){
        return  a-b;
    }

    public static int mul (int a, int b){
        return a * b ;
    }

    public static int div ( int a, int b){
        if (b == 0) return 0;
        return a / b;
    }

    public static int mod( int a, int b){
        if (b == 0) return 0;
        return a % b;
    }



}
