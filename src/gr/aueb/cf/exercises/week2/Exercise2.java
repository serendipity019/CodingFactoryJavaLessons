package gr.aueb.cf.exercises.week2;

import java.util.Scanner;
/**
 * This program make a menu. 
 * When the user insert num 5 the program close.
 */

 public class Exercise2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte num = 0;
        
        System.out.print("Please give the number 1 for insert ");
        System.out.println("or give the number 2 for Delete");
        System.out.print("or give the number 3 for Update ");
        System.out.println("or give the number 4 for search");
        System.out.println("or give the number 5 for close the program.");
        num = sc.nextByte();
        do {
            
            System.out.println("Give a number 1 - 5 please!");
            num = sc.nextByte();
        
        } while(num < 0 || num > 5);

        while (num != 5){
            if (num == 1){
                System.out.println("You chose Insert.");
            } else if(num == 2){
                System.out.println("You chose Delete.");
            } else if (num == 3){
                System.out.println("You chose Update.");
            } else if (num == 4){
                System.out.println("You chose Search.");
            }
                
            
            System.out.println("Give number 1 to 4 for proccess or give the number 5 to close the program.");
            num = sc.nextByte();
            if (num == 5) {
                System.out.println("Goodbye! The program close.");
            }
        }
    }
 }