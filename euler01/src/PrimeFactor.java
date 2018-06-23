import java.math.BigInteger;
import java.util.stream.LongStream;

import static java.lang.Math.sqrt;

public class PrimeFactor {
    //The prime factors of 13195 are 5, 7, 13 and 29.
    //
    //What is the largest prime factor of the number 600851475143 ?
    public static void main(String[] args) {
        SuchTimer.startTimer();
        LongStream stream = LongStream.iterate((int) Math.sqrt(600851475143L), i -> i-1)
                .filter(i -> 600851475143L % i == 0).filter(PrimeFactor::isPrime);
        System.out.println(stream.findFirst().getAsLong());
        SuchTimer.endTimer();
    }

    private static boolean isPrime(long number) {
        BigInteger as = new BigInteger(String.valueOf(number));
        return as.isProbablePrime(5);
    }
}
