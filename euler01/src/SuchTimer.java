import java.time.Duration;
import java.time.Instant;

public class SuchTimer {
    static Instant start;
    static Instant end;
    static Duration between;

    public static void startTimer() {
        start = Instant.now();
    }

    public static void endTimer() {
        end = Instant.now();
        setBetween();
        formatTime();
    }

    private static void setBetween() {
        between = Duration.between(start, end);
    }

    private static void formatTime() {
        System.out.format("%dD, %02d:%02d:%02d.%04d \n", between.toDays(),
                between.toHours(), between.toMinutes(), between.getSeconds(), between.toMillis());
    }
}
