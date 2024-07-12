package dars_5.uygaVazifa_3;

import java.util.concurrent.CompletableFuture;

public class Calculator {
    public CompletableFuture<Integer> add(int a, int b){
        return CompletableFuture.supplyAsync(() -> a+b);
    }

    public CompletableFuture<Integer> subtract(int a, int b) {
        return CompletableFuture.supplyAsync(() -> a - b);
    }

}
