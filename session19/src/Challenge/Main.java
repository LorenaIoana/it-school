package Challenge;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.id = 897437589375L;
        Product product2 = new Product();
        product2.id = 78663452L;

        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode() + " " + product2.hashCode());


           /*   SONG
        Song song1 = new Song();
        song1.title = "Hypnotize";
        song1.artist= "SOA";
        Song song2 = new Song();
        song2.title = "Hypnotize";
        song2.artist= "SOA";

        System.out.println(song1.equals(song2));
        System.out.println(song1.hashCode() + " " + song2.hashCode());
*/
       /*         STUDENT
        Student student1 = new Student();
        student1.name = "Lori";
        student1.age = 21;
        student1.email = "marianlorena@yahoo.com";
        Student student2 = new Student();
        student2.name = "Lori";
        student2.age = 21;
        student2.email = "marianlorena@yahoo.com";

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode() + " " + student2.hashCode());
*/

              /*  PERSON
        Person person1 = new Person();
        person1.name = "Lori";
        person1.age = 21;
        Person person2 = new Person();
        person2.name = "Lori";
        person2.age = 21;

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode() + " " + person2.hashCode());
*/

                //RECTANGLE
        /*Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 4;
        rectangle1.height = 7;
        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 4;
        rectangle2.height = 7;

        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode() + " " + rectangle2.hashCode());*/
    }
}
