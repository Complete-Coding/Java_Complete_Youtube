package in.kgcoding.challenge114;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Prashant", 100),
                new Employee("Sanchit", 1000),
                new Employee("Ram", 10000),
                new Employee("Shyam", 1),
                new Employee("Mohan", 5)
                );

        employees.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
