import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Perimeter Calculator");
        System.out.print("Please enter all 4 sides in cms: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeter = a + b + c + d;
        System.out.println("Perimeter of your rectangle is: " + perimeter + "cm");
    }
}
