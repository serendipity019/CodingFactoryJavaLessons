package gr.aueb.cf.ch4;

/**
 * Calculate the sum and mul of first 10 integers.
 */
public class symMul {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10){
            sum += i;
            i++;
        }

        int j = 1;
        int mul = 1;
        while(j <= 10){
            mul *= j;
            j++;
        }

        System.out.printf("The sum is: %d. The multiply is: %d", sum, mul);
    }
}
