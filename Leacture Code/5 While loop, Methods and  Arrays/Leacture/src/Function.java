public class Function {
    public static void main(String[] args) {
//        System.out.println("In main method");
//        greetUser();
//        System.out.println("Method calling complete");
//        greetUser();

        printFirstPattern();
//        printSecondPattern();
//        printThirdPattern();
    }

    public static void printThirdPattern() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }

    public static void printSecondPattern() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }

    public static void printFirstPattern() {
        int rows = 0;
        while (rows < 5) {
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

    public static void greetUser() {
        System.out.println("Good Morning from KGCoding");
    }

}
