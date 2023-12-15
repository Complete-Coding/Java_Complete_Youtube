import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the World of Three\n");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int second = input.nextInt();
        System.out.print("Finally, enter your third number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + " is the greatest number");
        } else if (second >= third) {
            System.out.println(second + " is the greatest number");
        } else {
            System.out.println(third + " is the greatest number");
        }
    }
}


