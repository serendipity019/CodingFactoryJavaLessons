package gr.aueb.cf.ch4;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("please insert a num");
        inputNum = sc.nextInt();

        while (inputNum >= 0){
            positivesCount++;
            System.out.println("please insert a num");
            inputNum = sc.nextInt();

        }

        System.out.println("positives count: " + positivesCount);
    }
}
