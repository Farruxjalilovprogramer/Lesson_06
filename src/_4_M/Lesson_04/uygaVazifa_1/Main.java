package dars_4.uygaVazifa_1;

import java.util.Objects;
import java.util.Timer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        ExecuteClass executeClass = new ExecuteClass(Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < 12; i++) {
            final int I = i;
            Callable<Boolean> callable = new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    TimeUnit.MILLISECONDS.sleep(300);
                    return I > 5;
                }
            };
            Future<Boolean> future = executeClass.execute(callable);

            try {
                Boolean res = future.get();
                if(future.isDone())
                    System.out.println(res);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executeClass.shutdown();

    }

}
