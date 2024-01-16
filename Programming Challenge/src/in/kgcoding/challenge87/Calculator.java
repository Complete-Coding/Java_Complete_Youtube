package in.kgcoding.challenge87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Now, the second: ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage()
                    .equals("/ by zero")) {
                System.out.println("Divide by zero occurred.");
            } else {
                throw exception;
            }
        }
    }
}
