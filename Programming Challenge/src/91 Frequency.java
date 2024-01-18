import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,8,6,4,1,7,8,1);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 7));
        System.out.println(Collections.frequency(list, 8));
    }
}








