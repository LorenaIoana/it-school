package com.itschool.course;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        mapMethod();
    }

    private static void mapMethod() {
        Map<Long, String> personMap = new HashMap<>();
        personMap.put(191777777L, "Ionutz Gabriel");
        personMap.put(29374654654L, "Andreea");
        personMap.put(197345645L, "Ionutz Gabriel");
        personMap.put(53866768L, "Vasilica");

        personMap.put(53866768L, "Andrei");

        long mihaiCnp = 193576768L;
        personMap.put(mihaiCnp, "Stoian Mihai");

        String myValue = personMap.get(mihaiCnp);
        //System.out.println(myValue);

        Map<String, Long> map = new HashMap<>();
        map.put("Ionutz", 12345L);

        for (Map.Entry<Long, String> entry : personMap.entrySet()) {
            long key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", value: " + value);
        }

        for (Long key : personMap.keySet()) {
            System.out.println(key);
            boolean isFound = false;

            if (isFound) {
                String name = personMap.get(key);
            }
        }
    }
}
