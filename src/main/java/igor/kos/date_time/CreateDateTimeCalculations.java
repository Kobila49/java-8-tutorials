package igor.kos.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.lang.System.out;

public class CreateDateTimeCalculations {

    public static void main(String[] args) {

        out.println("\n*** Create Date and Time, Part 2 ***\n");

        LocalDate date = LocalDate.of(2024, 8, 19);
        out.println("1. " + date);

        LocalDate tempDate = date.plusYears(3);
        out.println("2. " + tempDate);

        LocalTime time = LocalTime.of(12, 30);
        out.println("3. " + time);

        LocalTime tempTime = time.plusHours(3);
        out.println("4. " + tempTime);

        tempDate = date.minusMonths(2);
        out.println("5. " + tempDate);

        tempTime = time.minusMinutes(15);
        out.println("6. " + tempTime);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        out.println("7. " + dateTime);

        LocalDateTime tempDateTime = dateTime
                .plusDays(3)
                .plusMonths(2)
                .plusHours(4);
        out.println("8. " + tempDateTime);

        LocalDate date1 = LocalDate.of(2024, 8, 19);
        LocalDate date2 = LocalDate.of(2024, 8, 19);
        out.println("9. " + date1.equals(date2));

        date2 = date2.plusDays(3);
        out.println("10. " + date2.isAfter(date1));
        out.println("11. " + date2.isBefore(date1));

    }
}
