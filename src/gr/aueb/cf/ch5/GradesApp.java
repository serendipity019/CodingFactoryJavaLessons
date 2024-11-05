package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * The user give:
 * 1. the grades of lessons
 * 2. the plenty of lessons
 * will compute the average and will output
 * excellent if average is bigger than 9,
 * very good if the average is bigger than 7,
 * good if it is bigger than 5 and feilure if
 * the average is under 5.
 */
public class GradesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks =sc.nextInt();

        if (totalMarks <= 0){
            System.out.println("Total marks must not be zero.");
            System.exit(1);
        }

        System.out.println("Please insert courses count.");
        coursesCount = sc.nextInt();

        if (totalMarks <= 0){
            System.out.println("Courses count must not be zero or negative.");
            System.exit(2);
        }

        average = totalMarks / coursesCount;

        if( average > 10){
            System.out.println("Error. The average must be less or equal than 10.");
            System.exit(3);
        }

        if( average >= 9){
            System.out.println("Excellent!");
        } else if (average >= 7) {
            System.out.println("Very Good!");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Failure");
        }

    }
}
