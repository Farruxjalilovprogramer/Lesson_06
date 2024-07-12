package dars_5.uygaVazifa_1;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        int size = 100000;
        double[] arr = new double [size];
        for (int i = 0; i < size; i++) {
            lock.lock();
            lock.unlock();
            arr[i] = new Random().nextInt();
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        ForkJoinExecuteClass forkJoinExecuteClass = new ForkJoinExecuteClass(arr,0,size);
//        ForkJoinPool forkJoinPool1 = new RecursiveTask<>(Integer) {
//            @Override
//            protected Object compute() {
//                return null;
//            }
//        };
        System.out.println(forkJoinPool.invoke(forkJoinExecuteClass));

    }
}
