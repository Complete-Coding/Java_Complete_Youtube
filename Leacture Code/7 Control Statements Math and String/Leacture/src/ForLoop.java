public class ForLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 1; j <= 100; j += 2) {
            System.out.print(j + " ");
        }
    }
}
