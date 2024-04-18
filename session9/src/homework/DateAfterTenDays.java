package homework;

import java.time.LocalDate;

public class DateAfterTenDays {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate afterTenDays = today.plusDays(10);
        System.out.println("The date after 10 days will be: "+afterTenDays);
    }
}
