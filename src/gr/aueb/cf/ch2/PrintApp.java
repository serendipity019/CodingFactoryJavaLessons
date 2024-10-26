package gr.aueb.cf.ch2;

public class PrintApp {
    public static void main(String[] args){
        int day = 5;
        int month = 7;
        int year = 2024;

        System.out.println("The date is: " + day + "/" + month + "/" + year );
        System.out.printf("The date is: %02d/%02d/%d", day, month, year);
    }
}
