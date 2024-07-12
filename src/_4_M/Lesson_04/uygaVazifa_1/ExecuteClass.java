package dars_4.uygaVazifa_1;

import java.util.concurrent.*;

public class ExecuteClass implements Executor {
    private final ExecutorService executorService;

    public ExecuteClass(int n) {
        this.executorService = Executors.newFixedThreadPool(n);
    }

    @Override
    public void execute(Runnable command) {
        executorService.execute(command);
    }

    public <T>Future<T> execute(Callable<T> callable) {
        return executorService.submit(callable);
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
