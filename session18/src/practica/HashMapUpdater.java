package practica;

import com.sun.jdi.IntegerValue;

import java.util.HashMap;

public class HashMapUpdater {

    public HashMap<String, Integer> updateValue(HashMap<String, Integer> map, String key, Integer value) {
        map.put(key, value);
        return map;
    }
}
