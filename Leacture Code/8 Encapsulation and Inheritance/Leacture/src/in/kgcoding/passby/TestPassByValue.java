package in.kgcoding.passby;

public class TestPassByValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = add(x, y);
        System.out.printf("x=%d, y=%d, sum=%d", x, y, sum);
    }

    public static int add(int a, int b) {
        a = 99;
        return a;
    }
}
