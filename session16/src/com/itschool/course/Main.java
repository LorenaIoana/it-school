package com.itschool.course;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        computeInstance(vehicle);

        Bike bike = new Bike();
        bike.run();
        computeInstance(bike);

        Vehicle bikeVehicle = new Bike();
        bikeVehicle.run();
        int wheels = bikeVehicle.wheels;
        computeInstance(bikeVehicle);

        Bike bike2 = (Bike) bikeVehicle;
        bike2.pedal();
        computeInstance(bike2);

        Bike bike3 = (Bike) bikeVehicle;
        bike3.pedal();
    }

    private static void computeInstance(Vehicle vehicle) {
        if (vehicle instanceof Bike bike) {
            System.out.println("Instance of bike!");
            ((Bike) vehicle).pedal();
            bike.pedal();
        } else {
            System.out.println("Not an instance of Bike!");
        }
    }
}
