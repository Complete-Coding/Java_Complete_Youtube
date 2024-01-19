package in.kgcoding.multithreading.sleep;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before Sleeping");
        Thread.sleep(5000);
        System.out.println("Woke up");
    }
}
