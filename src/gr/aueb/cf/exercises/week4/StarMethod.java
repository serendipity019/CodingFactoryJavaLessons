package gr.aueb.cf.exercises.week4;

/**
 * The same like the stars in previous week.
 * print stars with 5 diferent styles
 * horizontal, vertical, n*n, 1 to n, n to 1 
 * Here The App work until the user give number 6 for exit.
 */
import java.util.Scanner;

public class StarMethod {
    static Scanner sc = new Scanner(System.in);
        private static int n;
        public static void main(String[] args) {
            
            int choice = 0;
            
            do{
                printMenu();
            choice = getOneInt();
    
            if (!isChoiceValid(choice)){
                System.out.println("Error. Choice not valid."); 
                continue;           
            } else {
                doOnChoice(choice);            
            }          
            }while (choice != 6);
    
                     
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
            System.out.println("6. Εξοδος");
        }
    
        public static boolean isChoiceValid(int choice){
            return  choice >= 1 && choice <= 6; 
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
            case 6:
                System.out.println("The App Close...");
                break;    
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }

}
