package _4_M.Lesson_02.uygaVazifa_4;

public class ThreadClass extends Thread {

    private DeadLockClass deadlock;
    private boolean useFirstOrder;

    public ThreadClass(DeadLockClass deadlock, boolean useFirstOrder) {
        this.deadlock = deadlock;
        this.useFirstOrder = useFirstOrder;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (useFirstOrder) {
                deadlock.incrementLock1ThenLock2();
            } else {
                deadlock.incrementLock2ThenLock1();
            }
        }
    }
}
