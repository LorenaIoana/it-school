package com.itschool.course.homework.ex1;

public class HomeworkEx1Main {

    public static void main(String[] args) {
        // here we will call homework stuff for exercise X

        int a = 7, b =9;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        double c = 10.5, d = 4.5;
        System.out.println("c + d = " + (c + d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));

        int e = +10;
        int f = -20;
        System.out.println(e);
        System.out.println(f);

        int num = -25;
        System.out.println(+num);
        System.out.println(-num);

        boolean isFirstTime = true;
        boolean isRegistered = false;

        System.out.println( !isFirstTime);
        System.out.println( !isRegistered);
        System.out.println( isFirstTime);
        System.out.println( isRegistered);


        System.out.println(a++);
        System.out.println(++b);



    }

}
