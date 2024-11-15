package gr.aueb.cf.ch7;

public class PowerAppRecursive {
    public static void main(String[] args) {

    }

    /**
     * Recursive version of power app.
     * @param a the base.
     * @param n the power.
     * @return the base raised to the power.
     */
    public static long power( long a, long n){
        return (n == 0) ? 1L : power(a, n-1) * a;
    }
}
