package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("124585487856525485554212");
        BigInteger bigNum2 = new BigInteger("254847542165584544569632");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("The sum is : %,d", result);
    }
}
