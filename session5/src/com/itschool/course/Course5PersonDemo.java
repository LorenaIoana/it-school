package com.itschool.course;

public class Course5PersonDemo {

    public static void main(String[] args) {
        Person ionutz = new Person();
        Person maria = new Person();
        Person laura = new Person();

        System.out.println(ionutz.getLastName());

        System.out.println(ionutz.getAge());
        System.out.println(ionutz.getCnp());

        ionutz.setFirstName("Ionutz");
        ionutz.setAge(32);
        ionutz.setCnp(191562462374L);

        System.out.println("Result after setting properties");
        System.out.println(ionutz.getFirstName());

        System.out.println(ionutz.getAge());
        System.out.println(ionutz.getCnp());

        String ionutzFirstName = ionutz.getFirstName();
        System.out.println("Person's first name is: " + ionutzFirstName);
    }
}
