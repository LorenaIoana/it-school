package com.itschool.course;

public class Course14Main {

    public static void main(String[] args) {
        Car oldCar = new OldCar();
        oldCar.run();
        System.out.println("=======modern car");

        Car modernCar = new BrandNewCar();
        oldCar.run();

        AbstractClassWithoutAbstractMethods abstractClass = new AbstractClassWithoutAbstractMethods() {
            @Override
            public void sisplaySmth() {
                super.sisplaySmth();
            }
        };

        System.out.println("========interface");
        MyInterface myInterface = new MyConcreteClass();
        myInterface.printFromInterface2();
    }
}
