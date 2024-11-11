package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Demo of switch or case
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;

        do{
            System.out.println("Επιλέξτε ένα απο τα παρακάτω:");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");

            choice = sc.nextInt();
            if (choice <1 || choice > 4 ){
                System.out.println("Choice must be one from above");
                System.out.println("Try again");
                continue;
            }

            switch (choice){
                case 1:
                    System.out.println("One-player game started.");
                    break;
                case 2:
                    System.out.println("Two-player game started.");
                    break;
                case 3:
                    System.out.println("Team game started.");
                    break;
                case 4:
                    System.out.println("Quiting...");
                    break;
                default:
                    System.out.println("Error in choice");
            }
        } while (choice !=4);
    }
}
