package com.itschool.course;

public class SwitchSeason {

    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season) {
            case AUTUMN -> System.out.println("The leafs are falling!");
            case WINTER -> System.out.println("It's snowing!");
            case SPRING -> System.out.println("The flowers are green!");
            case SUMMER -> System.out.println("I'm on the beach!");
            default -> System.out.println("Unknown season!");
       }
    }
}
