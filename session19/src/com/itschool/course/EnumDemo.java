package com.itschool.course;

public class EnumDemo {

    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter.getDescription());
        System.out.println(winter.getNumber());
    }
}
