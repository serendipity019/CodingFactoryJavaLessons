package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Switch-case is fall-through and can be used
 * as a logical OR.
 */
public class SwitchCaseFallThrough {
    public static void main(String[] args) {
        int grade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the grade ");
        grade = sc.nextInt();

        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error in grade.");
                break;
        }
    }
}
