package _4_M.Lesson_02.uygaVazifa_3;

public class ThreadClass implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Counter.increment();
        }
    }
}
