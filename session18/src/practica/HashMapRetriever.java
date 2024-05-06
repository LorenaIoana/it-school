package practica;

import java.util.HashMap;

public class HashMapRetriever {

    public Integer retrieveValue(HashMap<String, Integer> map, String key) {
        return map.get(key);
    }
}
