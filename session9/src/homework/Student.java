package homework;

public class Student {

    String name;
    int age;

    public void displayDetsil() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] arg) {
        Student s = new Student();
        s.name = "Lori";
        s.age = 21;
        s.displayDetsil();

        Student s2 = new Student();
        s2.name = "Lori";
        s2.age = 21;
        s2.displayDetsil();

        //System.out.println(s.toString());
        System.out.println(s.isEqual(s2));
    }

    public String toString() {
        return "Name: "+name + ", Age: "+age;
    }

    public boolean isEqual(Student other) {
        return this.name.equals(other.name) && this.age == other.age;
    }
}
