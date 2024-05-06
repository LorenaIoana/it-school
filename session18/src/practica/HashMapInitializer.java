package practica;

import java.util.HashMap;

public class HashMapInitializer {

    public HashMap<String, Integer> initializeMap() {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);

        return myMap;
    }
}
