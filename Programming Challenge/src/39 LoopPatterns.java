import java.util.Scanner;

class LoopPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are here to print patterns\n");
        System.out.print("Please enter the no of rows: ");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);
        printReverseRightHalfPyramid(rows);
        printLeftHalfPyramid(rows);
    }

    public static void printLeftHalfPyramid(int maxRows) {
        System.out.println("\nHere is Left Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            // this loop prints spaces
            int j = 0;
            while (j < rows - 1) {
                System.out.print("  ");
                j++;
            }

            // this loop prints stars
            int i = 0;
            while (i <= (maxRows-rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void printReverseRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is Reverse Right Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void printRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is Right Half Pyramid");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
