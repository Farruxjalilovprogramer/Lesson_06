package _4_M.Lesson_02.uygaVazifa_5;

public class FieldVisibility implements Runnable {
    private volatile boolean active = true;

    @Override
    public void run() {
        while (active){}
        System.out.println("Tugadi");
    }
    public void stop(){
        active = false;
    }
}
