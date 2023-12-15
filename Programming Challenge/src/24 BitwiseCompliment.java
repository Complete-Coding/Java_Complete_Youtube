import java.util.Scanner;

class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment Operator\n");
        System.out.print("Please enter your number");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your result is: " + result);
    }
}
