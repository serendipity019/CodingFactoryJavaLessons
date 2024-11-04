package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Compute how much jumps need make the frog to pass the road.
 * The frog want to go from the point X to the point Y and have stady hop Z.
 * for example put X=10, Y=85, Z=30
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 0;
        int start = 0;
        int hop = 0;
        int jumps = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the start point of the frog.");
        start = sc.nextInt();
        System.out.println("Give the target point of the frog.");
        target = sc.nextInt();
        System.out.println("Give the hop of the frog.");
        hop = sc.nextInt();

        jumps = (int) Math.ceil((target - start)/ (double) hop); // The ceil make round to the next integer number

        System.out.printf("The frog must make %d jumps.", jumps);

    }

}
