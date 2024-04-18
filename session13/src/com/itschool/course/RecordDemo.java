package com.itschool.course;

public class RecordDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.width());
        System.out.println(rectangle.lenght());

        System.out.println(rectangle.getwidth());

        rectangle.publicMethod();

        record Circle(int radius) {}
        Circle circle = new Circle(10);
        System.out.println(circle.radius());
    }
}
