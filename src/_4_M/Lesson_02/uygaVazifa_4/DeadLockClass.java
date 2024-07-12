package _4_M.Lesson_02.uygaVazifa_4;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DeadLockClass {

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    private int count;

    public int getCount() {
        return count;
    }

    public void incrementLock1ThenLock2() {
        lock1.lock();
        try {
            lock2.lock();
            try {
                count++;
            } finally {
                lock2.unlock();
            }
        } finally {
            lock1.unlock();
        }
    }

    public void incrementLock2ThenLock1() {
        lock2.lock();
        try {
            lock1.lock();
            try {
                count++;
            } finally {
                lock1.unlock();
            }
        } finally {
            lock2.unlock();
        }
    }
}
