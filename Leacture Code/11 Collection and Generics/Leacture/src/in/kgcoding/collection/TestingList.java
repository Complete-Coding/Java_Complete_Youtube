package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        strList.add("Prashant");
        strList.add("Jain");
        //strList.add(54);

        strList.add(1, "Pradeep");
        strList.remove(0);

        if (strList.contains("Jain")) {
            System.out.println(strList.indexOf("Jain"));
        }

        for(int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }

        for (String str : strList) {
            System.out.print(str);
        }
    }
}
