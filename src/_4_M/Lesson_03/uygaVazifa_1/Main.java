package dars_3.uygaVazifa_1;

import com.sun.source.tree.Tree;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () ->{
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getCount());

    }
}
