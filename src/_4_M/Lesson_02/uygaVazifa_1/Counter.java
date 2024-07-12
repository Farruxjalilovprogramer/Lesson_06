package dars_2.uygaVazifa_1;

public class Counter {
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void counter(){
        setSum(getSum()+1);
    }
    public synchronized void counterSynch(){
        setSum(getSum()+1);
    }
    public void incrementSum(){
        synchronized (this){
            sum++;
        }
    }
}
