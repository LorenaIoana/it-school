package com.itschool.course;

import java.io.StringBufferInputStream;
import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

    }

    private static void lightArray() {
        int[] intArray = {1, 2, 3};
        int[] zeroArray = new int[4];
        String[] stringArray = {"Ala", "Bala", "Portocala"};
        String[] fiveStringArray = new String[5];

        System.out.println(Arrays.toString(zeroArray));
        System.out.println(Arrays.toString(fiveStringArray));

        String[] arrayWithNewAndFixed = new String[]{"Ala", "Bala", "Portocala"};
        String string = "ceva";
    }

    private static void sortArrays() {
        String[] cities = {"iasi", "bucuresti", "cluj"};
        System.out.println("Unsorted cities");
        System.out.println(Arrays.toString(cities));

        Arrays.sort(cities);
        System.out.println("Natural sorted cities: ");
        System.out.println(Arrays.toString(cities));

       // Arrays.sort(cities, (o1, o2) -> o1.charAt(0) > o2.charAt(0));
    }

}
