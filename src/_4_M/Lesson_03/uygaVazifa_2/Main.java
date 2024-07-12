package dars_3.uygaVazifa_2;

import java.util.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Vector integers = new Vector<>();

        Runnable runnable1 = () -> {
            for (int i = 0; i < 1000; i++) {
                integers.add(1);
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i < 1000; i++) {
                integers.add(1);
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        Thread.sleep(100);

        System.out.println(integers.size());
    }
}
