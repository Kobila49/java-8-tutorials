package igor.kos.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.lang.System.out;

public class CreateDateTime {

    public static void main(String[] args) {
        out.println("\n*** Create Date and Time, Part 1 ***\n");

        LocalDate localDate = LocalDate.now();

        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        localDate = LocalDate.of(2024, 8, 19);
        out.println(localDate);

        localTime = LocalTime.of(12, 30, 45);
        out.println(localTime);

        localDateTime = LocalDateTime.of(2024, 8, 19,
                                         12, 30, 45);
        out.println(localDateTime);

        zonedDateTime = ZonedDateTime.of(2024, 8, 19,
                                         12, 30, 45, 0,
                                         ZoneId.of("America/Chicago"));
        out.println(zonedDateTime);
    }
}
