package challenges;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Colors {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Purple");

        colors.add(0, "Pink");
        colors.remove(3);
        colors.set(3, "Black");
        colors.remove(2);

        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        if (colors.contains("Blue")) {
            System.out.println("Blue is in the list");
        }

        Collections.sort(colors);
        for (String i : colors) {
            System.out.println(i);
        }

        ArrayList<String> pencilBox = new ArrayList<>(colors.size());

        for (String box : pencilBox) {

        }
        colors.clone();
    }
}
