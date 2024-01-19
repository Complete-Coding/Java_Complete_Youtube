package in.kgcoding.multithreading.synchronize;

public class TestingSynchronize {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("Final counter value: %d and" +
                " time taken: %d",
                counter.getCount(),
                (endTime - startTime));
    }
}
