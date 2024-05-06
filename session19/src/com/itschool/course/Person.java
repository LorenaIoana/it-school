package com.itschool.course;

public class Person {

    private String name;
    private long cnp;

    //private int age;

    public Person(String name, long cnp) {
        this.name = name;
        //this.age = age;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

   /* public int getAge() {
        return age;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
               // ", age=" + age +
                ", cnp=" + cnp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (cnp != person.cnp) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (int) (cnp ^ (cnp >>> 32));
        return result;
    }
}
