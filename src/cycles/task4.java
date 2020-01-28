package cycles;

//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class task4 {
    public static void main(String[] args) {
        BigInteger mult = BigInteger.valueOf(1);
        for (int i=1; i<=200;i++){
            BigInteger a = BigInteger.valueOf(i).pow(2);
            mult = mult.multiply(a);
        }
        System.out.println("Произведения квадратов первых двухсот чисел = " + mult);
    }
}
