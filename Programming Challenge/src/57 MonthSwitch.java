import java.util.Scanner;

class MonthSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Month mapping\n");
        System.out.print("Please enter your month number: ");
        int monthNum = input.nextInt();
        String monthName = getMonthName(monthNum);
        System.out.println("Your month name is: " + monthName);
    }

    public static String getMonthName(int monthNum) {
        return switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Mars Month";
        };
    }
}









