package gr.aueb.cf.ch4;

/**
 * Print 10 horizontals stars.
 */
public class StarsWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10){
            System.out.print("*");
            i++;
        }
        System.out.println("");
        int j = 10;
        while (j >= 0){
            System.out.print("*");
            j--;
        }

    }
}
