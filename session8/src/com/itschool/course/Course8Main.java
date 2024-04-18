package com.itschool.course;

public class Course8Main {

    private final String CONSTANT = "aaa";

    public static void main(String[] args) {
        Person ionutz =new(32, "baur");
        ionutz.getAge();
        ionutz.getName();

        ionutz = new Person(32, "baur");
        String text = "random text";
        System.out.println("Original text is: "+ text);

        String upperText = text.toUpperCase();
        System.out.println("uppercase text: "+upperText);
    }

}
