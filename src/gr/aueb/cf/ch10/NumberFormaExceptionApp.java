package gr.aueb.cf.ch10;

import java.util.Scanner;

public class NumberFormaExceptionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        try {
            System.out.println("Please insert an integer");
            inputStr = sc.nextLine();

            num = Integer.parseInt(inputStr);

            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("Input must be an integer");
        }

    }
}
