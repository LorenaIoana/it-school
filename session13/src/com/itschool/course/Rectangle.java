package com.itschool.course;

public record Rectangle(int lenght, int width) {

    private void test() {
        System.out.println("bla bla");
    }

    public void publicMethod() {
        test();
    }

    public int getlenght() {
        return lenght;
    }

    public int getwidth() {
        return width;
    }
}
