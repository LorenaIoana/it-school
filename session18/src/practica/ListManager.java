package practica;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    public List<Integer> initializeList() {
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            myList.add(i);
        }
        return myList;
    }
}
