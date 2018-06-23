import java.time.Duration;
import java.time.Instant;

public class MultiplesOf3an5 {
    //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    //
    //Find the sum of all the multiples of 3 or 5 below 1000.

    static long sum = 0;
    static long n = 1000;

    public static void main(String[] args) {
        SuchTimer.startTimer();
        for (long i = 0; i < n; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        SuchTimer.endTimer();
        System.out.println(sum);
    }
}
