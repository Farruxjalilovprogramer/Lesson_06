package _4_M.Lesson_02.uygaVazifa_2;


public class Main {
    public static void main(String[] args) {

        ThreadClass thread1 = new ThreadClass();
        ThreadClass thread2 = new ThreadClass();

        Thread thr1 = new Thread(thread1);
        Thread thr2 = new Thread(thread2);

        thr1.start();
        thr2.start();
        try {
            thr1.join();
            thr2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(Counter.getCount());
    }
}
