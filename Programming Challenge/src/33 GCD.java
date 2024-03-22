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

    public static int gcd(int First, int Second) {
        // Initialize the greatest common divisor (gcd) to 1 || For eg - {12,20} {11,30} {11,33} 
        int gcd = 1;
        
        // Check if one number is a multiple of the other
        if (Second % First == 0) {
            return First; // Return First if it divides Second evenly
        } else if (First % Second == 0) {
            return Second; // Return Second if it divides First evenly
        }// {12,20} {11,30}          {11,33} --> 3 
        
        // Start checking divisibility from 2
        int i = 2;

        // Iterate through numbers from 2 to 10 to find the greatest common divisor
        while (i <= 10) {
            // Check if both First and Second are divisible by the current number (i)
            if (First % i == 0 && Second % i == 0) {
                gcd = i; // Update gcd if i is a common divisor
            }
            i++; // Move to the next number
        }// {11,30}-->0       {12,20} ---> 2 

        // Check if a common divisor was found
        if (gcd == 1) {
            /* As the gcm is still one, In this case both or one of them will be prime otherwise they will get be  
            divisible by any number from 2 to 10 
            */
            return 0;
        //  {11,30} ---> 0
        } else {
            return gcd; // Return the greatest common divisor
        }// {12,20}--> 2
    }
}

