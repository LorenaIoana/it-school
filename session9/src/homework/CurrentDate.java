package homework;

import java.time.LocalDate;

public class CurrentDate {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: "+today);
    }
}
