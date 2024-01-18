package in.kgcoding.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Prashant"));
        System.out.println(names.add("Sanchit"));
        System.out.println(names.add("KG Coding"));
        Utility.print(names);

        System.out.println(names.add("Prashant"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Prashant"));
        System.out.println(names.remove("Prashant"));
        Utility.print(names);
        System.out.println(names.remove("Prashant"));
    }
}








