package dars_3.uygaVazifa_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger count = new AtomicInteger();


    public int getCount() {
        return count.get();
    }
    public void increment(){
        count.incrementAndGet();
    }
}
