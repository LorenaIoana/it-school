package Practica;

public class Main {

    public static void main(String[] args) {

        GameCharacter knight = new GameCharacter(new Sword());

        knight.attack();

        knight.setWeapon(new Bow());

        knight.attack();

       /* Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println(dog.sound());*/

        /*  Car car = new Car();
        Truck truck = new Truck();

        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());

        Vehicle vehicle = new Car();
        Car car1 = (Car) vehicle;

        Truck truck = (Truck) vehicle;*/

       /* Fruit fruit = new Apple();

        System.out.println(fruit.taste());

        Apple apple = (Apple) fruit;*/

       /* printFruitDetails(new Apple());
        printFruitDetails(new Orange());
    }

    private static void printFruitDetails(Fruit fruit) {
        System.out.println("Taste: " + fruit.taste());
        System.out.println("Color: " + fruit.color());
    }*/
    }
}
