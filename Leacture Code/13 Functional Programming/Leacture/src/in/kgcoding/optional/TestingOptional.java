package in.kgcoding.optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
        Optional<Integer> newSum2 = numbers.stream()
                .reduce((a, b) -> a + b);
        if (newSum2.isPresent()) {
            System.out.println(newSum2.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
