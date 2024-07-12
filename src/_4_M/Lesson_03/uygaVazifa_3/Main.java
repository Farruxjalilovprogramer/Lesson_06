package dars_3.uygaVazifa_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        var integers = Collections.synchronizedList(arrayList);

        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++) {
                integers.add(i);
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i < 10; i++) {
                integers.add(i+10);
            }
        };
        new Thread(runnable1).start();
        new Thread(runnable2).start();

        Thread.sleep(15);

        integers.remove(5);

        Thread.sleep(100);

        System.out.println(integers);

    }
}
