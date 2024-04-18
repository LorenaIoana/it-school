package com.itschool.course;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Course9 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int dayOfYear = localDate.getDayOfYear();
        System.out.println(dayOfYear);

        LocalDate dateOfBirth = LocalDate.of(1991, 10, 11);
        System.out.println(dateOfBirth);
    }

        private static void localDateTimeDemo() {
            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println("Before formatting");
            System.out.println(localDateTime);

            System.out.println("After formatting");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
            System.out.println(localDateTime.format(formatter));
        }
}
