package Online.dars_5;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinEx {
    public static void main(String[] args) {
        int size = 500_000;
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random();
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CounterRecursiveTask counterRecursiveTask = new CounterRecursiveTask(arr,0,size);
        forkJoinPool.invoke(counterRecursiveTask);
        System.out.println(counterRecursiveTask.join());
    }
}
