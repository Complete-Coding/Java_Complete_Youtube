package in.kgcoding.executor;

public class PrintTask implements Runnable {
    @Override
    public void run() {
        // Print task
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ", i, targetChar);
        }
        System.out.printf("\n %s %c task complete",
                Thread.currentThread().getName(),
                targetChar);
    }

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
