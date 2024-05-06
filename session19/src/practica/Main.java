package practica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics"};

        printArray(intArray);
        printArray(strArray);

        /*List<Employee> list = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.id = 1;

        list.add(emp1);

        Employee empSearch = new Employee();
        empSearch.id = 1;

        emp1.name = "Alice";
        emp1.department = "HR";

        Employee emp2 = new Employee();
        emp2.id = 1;
        emp1.name = "Alice";
        emp1.department = "HR";

        System.out.println(emp1.equals(emp2));

        HashSet<Employee>set = new HashSet<>();
        set.add(emp1);
        set.add(emp2);
        System.out.println(set.size());

        System.out.println(list.contains(empSearch));
        System.out.println(list.indexOf(empSearch));

        System.out.println(emp1);*/
    }
}
