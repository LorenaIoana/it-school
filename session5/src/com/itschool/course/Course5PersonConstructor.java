package com.itschool.course;

public class Course5PersonConstructor {

    public static void main(String[] args) {
        Person ionutz = new Person("Baur", 191562462374L);
        System.out.println(ionutz.getLastName());
        System.out.println(ionutz.getCnp());

        String lastName = ionutz.getLastName();
        long cnp = ionutz.getCnp();

        System.out.println(lastName);
        System.out.println(cnp);
    }
}
