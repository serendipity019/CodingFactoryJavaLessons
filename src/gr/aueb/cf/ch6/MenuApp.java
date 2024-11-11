package gr.aueb.cf.ch6;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            printMenu();
            choice = sc.nextInt();
        }while (choice != 5);
    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα απο τα παρακάτω:");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Εξοδος");
    }
}
