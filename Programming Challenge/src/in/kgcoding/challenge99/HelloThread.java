package in.kgcoding.challenge99;

public class HelloThread extends Thread {

    private final int threadNumber;

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) %s Hello from Thread-%d\n",
                    (i+1), Thread.currentThread().getName(),
                    threadNumber);
        }
    }
}
