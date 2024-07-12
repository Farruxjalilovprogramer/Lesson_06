package _4_M.Lesson_02.uygaVazifa_4;

public class Main {
    public static void main(String[] args) {
        DeadLockClass deadlock = new DeadLockClass();

        ThreadClass thread1 = new ThreadClass(deadlock, true);
        ThreadClass thread2 = new ThreadClass(deadlock, false);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(deadlock.getCount());
    }
}
