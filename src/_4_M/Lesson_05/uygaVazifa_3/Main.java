package dars_5.uygaVazifa_3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        CompletableFuture.supplyAsync(
                ()->
                Executors.newSingleThreadExecutor()
        );

        CompletableFuture<Integer> add = calculator.add(5,5);
        CompletableFuture<Integer> subtract = calculator.subtract(15,5);

        try {
            System.out.println(add.get());
            System.out.println(subtract.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
