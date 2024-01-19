package in.kgcoding.executor;

import in.kgcoding.multithreading.runnable.PrintTask;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintTask task1 = new PrintTask('*');
        PrintTask task2 = new PrintTask('$');
        PrintTask task3 = new PrintTask('#');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();
    }
}







