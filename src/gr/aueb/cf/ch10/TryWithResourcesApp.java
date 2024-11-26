package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {
    public static void main(String[] args) {
        int num = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("please insert a num");
            num = sc.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e){
          e.printStackTrace();
        }
    }
}
