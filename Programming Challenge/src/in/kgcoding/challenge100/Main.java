package in.kgcoding.challenge100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("\nCreate the thread %s",
                t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nthread finished %s",
                t1.getState());
    }
}
