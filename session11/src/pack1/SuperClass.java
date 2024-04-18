package pack1;

import com.itschool.course.House;

import java.io.File;
import java.io.IOException;

public class SuperClass {

    public int sum(int a, int b) {
        return a+ b;
    }

    private String getFullName() {
        String firstName = "Ionutz";
        String lastName = "Baur";

        return firstName + " " + lastName;
    }

    private void deleteFromDataBase() {
        // ...
        System.out.println("Delete from db");
    }

    public void createFile() throws IOException, NullPointerException, Exception, Error{

    }

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        int a = superClass.sum(1,2);
        System.out.println(a);
        String fullName = superClass.getFullName();
        superClass.deleteFromDataBase();
    }

    public final void publicMethod() {
        System.out.println("public method");
    }

    protected void protectedMethod() {
        System.out.println("protectedn method");
    }

    private void privateMethod() {
        System.out.println("private method");
    }

    void defaultMethod() {
        System.out.println("default (package-protected) method");
    }
}
