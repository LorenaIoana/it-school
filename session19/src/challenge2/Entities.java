package challenge2;

import java.util.ArrayList;
import java.util.List;

public class Entities {

    int id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entities entities = (Entities) o;

        return id == entities.id;
    }

    public static void main(String[] args) {
        Entities entitie1 = new Entities();
        entitie1.id = 123;
        entitie1.name = "Ana";
        Entities entitie2 = new Entities();
        entitie2.id = 456;
        entitie2.name = "Ana";

        System.out.println(entitie1.equals(entitie2));
    }
}
