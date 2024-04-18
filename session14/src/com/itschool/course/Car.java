package com.itschool.course;

public abstract sealed class Car permits OldCar, ModernCar {

    private int year;

    public Car(int year) {
        this.year = year;
    }

    public Car() {
    }

    public void run() {
        System.out.println("preparing to run the car");
        startEngine();
        shiftGears();
    }

    protected abstract void startEngine();

    protected abstract void shiftGears();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
