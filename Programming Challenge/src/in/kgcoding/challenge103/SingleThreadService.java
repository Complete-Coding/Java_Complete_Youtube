package in.kgcoding.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadService {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
          PrintNumbers task = new PrintNumbers();
          service.submit(task);
        }
    }
}
