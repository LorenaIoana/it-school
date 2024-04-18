package com.itschool.course;

public class Course11 {

    public static void main(String[] args) {
        varsDemo();
    }

    private static void classDemo() {
        House myHouse = new House("blue", 100);
        House sebiHouse = new House("red", 200);
        House lorenaHouse = new House("pink", 300);

        int mpUtils = myHouse.mputils();
        System.out.println("mp utils :" + mpUtils);

        int totalCost = House.totalCost(150,200);
        System.out.println("total cost: " + totalCost);

        int totalCOstWithInstance = myHouse.totalCost(200, 300);
    }

    private static void varsDemo() {
        VariablesDemo demo1 = new VariablesDemo();
        System.out.println(demo1.getInstanceVar());
        System.out.println(VariablesDemo.getStaticVar());

        System.out.println("===============");
        VariablesDemo demo2 = new VariablesDemo();
        System.out.println(demo2.getInstanceVar());
        System.out.println(VariablesDemo.getStaticVar());
    }
}
