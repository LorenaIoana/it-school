package homework;

public class Person {
    public Person(String alice) {
    }

    public static void main(String[] args) {
        Person alice1 = new Person("Alice");
        Person alice2 = new Person("Alice");

        System.out.println(alice1 != alice2);


    }
}

