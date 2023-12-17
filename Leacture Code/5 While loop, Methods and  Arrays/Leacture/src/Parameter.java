public class Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(4, 7));
        System.out.println(sumTwoNumbers(5, 9));
        System.out.println(sumTwoNumbers(-67, 67));
    }

    public static int sumTwoNumbers(int firstNum, int secondNum) {
        System.out.println("First Number received: " + firstNum);
        System.out.println("Second Number received: " + secondNum);
        return firstNum + secondNum;
    }
}
