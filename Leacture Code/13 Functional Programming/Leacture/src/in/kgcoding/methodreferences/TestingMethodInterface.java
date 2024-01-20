package in.kgcoding.methodreferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));

        int newSum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        newSum2 = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.printf("\nSum using reduce is %d", newSum2);
    }
}








