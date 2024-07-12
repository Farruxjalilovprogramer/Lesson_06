package dars_5.uygaVazifa_1;

import java.util.concurrent.RecursiveTask;

public class ForkJoinExecuteClass extends RecursiveTask<Integer> {
    private double[] arr;
    private int to;
    private int from;

    public ForkJoinExecuteClass(double[] arr, int from, int to) {
        this.arr = arr;
        this.to = to;
        this.from = from;
    }

    @Override
    protected Integer compute() {
        if(to - from < 1000){
            int count = 0 ;
            for (int i = 0; i < to; i++) {
                if (arr[i] < 100)
                    count++;
            }
            return count;
        }else {
            int mid = from+(to - from)/2;
            ForkJoinExecuteClass fist = new ForkJoinExecuteClass(arr, from, mid);
            ForkJoinExecuteClass second = new ForkJoinExecuteClass(arr, mid, to);
            invokeAll(fist,second);
            return fist.join()+second.join();
        }
    }
}
