package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Prashant", 34);
        map.put("Sanchit", 100);
        map.put("Ram", 100);
        map.put("sohan", 0);
        System.out.println(map.size());
        System.out.println(map.get("Prashant"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("sohan"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}









