import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication\n");
        System.out.print("Please enter first decimal number: ");
        double first = input.nextDouble();
        System.out.print("Now, please enter second number: ");
        double second = input.nextDouble();

        System.out.println("\n Result is: " + (first * second));
    }
}
