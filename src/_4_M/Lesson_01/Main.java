package _4_M.Lesson_01;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread("Thread - 1");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread runnableThread = new Thread(runnable,"Runnable thread");
        System.out.println(thread.getName());
        System.out.println(runnableThread.getName());

        thread.start();
        runnableThread.start();
        System.out.println(Thread.activeCount());

        Thread deamonThread = new Thread("Deamon thread");
        deamonThread.setDaemon(true);
        deamonThread.start();

        System.out.println(Thread.activeCount());
        thread.setPriority(8);
        runnableThread.setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
    }
}
