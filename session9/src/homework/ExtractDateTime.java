package homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExtractDateTime {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        LocalDate datePart = dt.toLocalDate();
        LocalTime timePart = dt.toLocalTime();

        System.out.println("Date: "+datePart);
        System.out.println("Time: "+timePart);
    }
}
