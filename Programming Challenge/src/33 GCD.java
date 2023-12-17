import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD");
        System.out.print("Please enter your number: ");
        int first = input.nextInt();
        System.out.print("Please enter your number: ");
        int second = input.nextInt();
        int gcd = gcd(first, second);
        System.out.println("GCD of the numbers is: " + gcd);
    }

    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
