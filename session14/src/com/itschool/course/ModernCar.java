package com.itschool.course;

public non-sealed abstract class ModernCar extends Car {
    @Override
    protected void startEngine() {
        System.out.println("Keyless go!");
    }

    @Override
    protected void shiftGears() {
        System.out.println("I have an automatic shifter");
    }
}
