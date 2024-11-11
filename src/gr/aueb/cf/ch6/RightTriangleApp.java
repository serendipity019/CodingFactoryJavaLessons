package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * checks if a triangle is right.
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc =new Scanner(System.in);
        final double EPSILON = 0.000005;

        System.out.println("Please enter b, c, a");
        b = sc.nextDouble();
        c = sc.nextDouble();
        a = sc.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON){
            System.out.println("Triangle is right");
        } else {
            System.out.println("Triangle is not right");
        }
    }
}
