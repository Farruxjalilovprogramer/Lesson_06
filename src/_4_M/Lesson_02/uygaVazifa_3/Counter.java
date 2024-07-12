package _4_M.Lesson_02.uygaVazifa_3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private static int count ;
    static Lock lock = new ReentrantLock();

    public static int getCount() {
        return count;
    }
    public static void increment(){
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}
