package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator\n");
        System.out.print("Please enter your two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        try {
            int[] a = new int[5];
            System.out.printf("Result is %d", a[6]);
            a[6] = first / second;
            System.out.printf("Result is %d", a[6]);
        } catch (ArithmeticException exception) {
            System.out.printf("%s, enter valid values",
                    exception.getMessage());
        } catch (Throwable th) {
            System.out.println("General Exception.");
            throw th;
        } finally {
            System.out.println("I am in finally");
        }
    }
}





