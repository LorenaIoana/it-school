package com.itschool.course;

import java.util.Scanner;

public class Course5 {

    public static void main(String[] args) {
        /* & -and
           && - and */

        /*| - or
        || - or  */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert boolean: ");
        String a = scanner.nextLine();;

        boolean trueVar = true;
        boolean falseVar = true;
        Boolean var = null;

        boolean result = trueVar || falseVar || var;

        System.out.println(result);

        System.out.println(trueVar | falseVar | var);

    }
}
