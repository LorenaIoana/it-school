package challenges;

public class TestPolymorphism {

    public static void main(String[] args) {

        Parent parent;
        parent = new Subclass1();
        parent.print();

        parent= new Subclass2();
        parent.print();
    }
}
