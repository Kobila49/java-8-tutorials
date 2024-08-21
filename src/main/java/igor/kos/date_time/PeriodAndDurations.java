package igor.kos.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

import static java.lang.System.out;

public class PeriodAndDurations {

    public static void main(String[] args) {
        out.println("\n*** Period and Durations ***\n");

        LocalDate nowDate = LocalDate.now();
        LocalDate futureDate = LocalDate.of(2024, 8, 28);

        Period period = Period.between(nowDate, futureDate);
        out.println("1. " + period.getDays());

        LocalTime nowTime = LocalTime.now();
        LocalTime futureTime = LocalTime.of(16, 30);

        Duration duration = Duration.between(nowTime, futureTime);
        out.println("2. " + duration.getSeconds());
        out.println("2. " + duration.getSeconds()/3600);
    }
}
