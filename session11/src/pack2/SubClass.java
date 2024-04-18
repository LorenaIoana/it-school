package pack2;

import com.itschool.course.House;
import pack1.MyInterface;
import pack1.SuperClass;

import java.util.Comparator;

public class SubClass extends SuperClass {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.publicMethod();
        subClass.protectedMethod();
        //subClass.privateMethod();
        //subClass.defaulteMethod();
    }
}
