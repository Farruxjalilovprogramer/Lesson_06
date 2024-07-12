package _4_M.Lesson_02.uygaVazifa_5;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FieldVisibility fieldVisibility = new FieldVisibility();

        Thread thread = new Thread(fieldVisibility);

        thread.start();

        TimeUnit.MILLISECONDS.sleep(4000);

        fieldVisibility.stop();
    }
}
