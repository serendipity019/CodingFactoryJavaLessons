package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateTimeToSecondsConverter {
    public static void main(String[] args) {
        final int SEC_PER_DAY = 24 * 60 * 60;
        final int SEC_PER_HOUR = 60 *60;


        Scanner in = new Scanner(System.in);
        int inputDays;
        int inputHours;
        int inputMinutes;
        int inputSeconds;
        long totalSec = 0;

        System.out.println("Please insert days, hours, minutes, seconds");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSec = inputDays * SEC_PER_DAY + inputHours * SEC_PER_HOUR
                + inputMinutes * 60 + inputSeconds;


        System.out.printf("The total Seconds are: %,d", totalSec);
    }
}
