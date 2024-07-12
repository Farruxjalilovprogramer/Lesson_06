package Online.dars_5;

import java.util.concurrent.RecursiveTask;

public class CounterRecursiveTask extends RecursiveTask<Integer> {
    private  double[] nums;
    private int from;
    private int to;
    private int limit = 1000;

    public CounterRecursiveTask(double[] nums, int from, int to) {
        this.nums = nums;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Integer compute() {
        if(to - from < limit){
            int count = 0 ;
            for (int i = 0; i < to; i++) {
                if(nums[i] > 0.5)
                    count++;
            }
            return count;
        }else {
            int mid = from+(to - from)/2;
            CounterRecursiveTask fist = new CounterRecursiveTask(nums, from, mid);
            CounterRecursiveTask second = new CounterRecursiveTask(nums, mid, to);
            invokeAll(fist,second);
            return fist.join()+second.join();
        }
    }
}
