package gr.aueb.cf.exercises.week3;

import java.util.Scanner;

/**
 * print stars with 5 diferent styles
 * horizontal, vertical, n*n, 1 to n, n to 1 
 */
public class Stars {    
    static Scanner sc = new Scanner(System.in);
        private static int n;
        public static void main(String[] args) {
            
            int choice = 0;
            
    
            printMenu();
            choice = getOneInt();
    
            if (!isChoiceValid(choice)){
                System.out.println("Error. Choice not valid.");            
            } else {
                doOnChoice(choice);            
            }                   
        }
    
        public static int getOneInt(){
            return sc.nextInt();
        }
    
        public static void horizontal(int n){
            for (int i = 1; i <= n; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    
        public static void vertical(int n){
            for (int i = 1; i <= n; i++){
                System.out.println("*");
            }
        } 
    
        // auti einai i n*n, square
        public static void square(int n){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n ; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    
        // auto einai to 1 eos n
        public static void scale(int n) {
            for (int i = 1; i <= n; i++){
                for (int j =1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    
        //auto einai to invert scale
        public static void invertScale(int n){
            for (int i = 1; i <= n; i++){
                //int temp = n;
                for (int j = i; j <= n ; j++){
                    System.out.print("*");                        
                }
                System.out.println("");
            }
        }
    
        public static void printMenu(){
            System.out.println("Επιλέξτε έναν απο τoυς παρακάτω τρόπους εμφάνισης:");
            System.out.println("1. Οριζόντια");
            System.out.println("2. Κάθετα");
            System.out.println("3. Τετράγωνο");
            System.out.println("4. Απο 1 εως n σκαλοπάτια");
            System.out.println("5. Απο n εως 1 σκαλοπάτια");
        }
    
        public static boolean isChoiceValid(int choice){
            return  choice >= 1 && choice <= 5; 
        }
    
        public static void doOnChoice( int choice){
            switch (choice){
                case 1:
                System.out.println("give the number of stars");
                n = getOneInt();
                horizontal(n);
                break;
            case 2:
                System.out.println("give the number of stars");
                n = getOneInt();
                vertical(n);
                break;
            case 3:
                System.out.println("give the number of stars");
                n = getOneInt();
                square(n);
                break;
            case 4:
                System.out.println("give the number of stars");
                n = getOneInt();
                scale(n);
                break;
            case 5:
                System.out.println("give the number of stars");
                n = getOneInt();
                invertScale(n);
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }





}
