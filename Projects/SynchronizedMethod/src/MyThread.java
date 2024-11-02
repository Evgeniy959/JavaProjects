public class MyThread extends Thread{
    protected MyResource counter = null;
    public MyThread(MyResource counter){
        this.counter = counter;
    }
    public void run() {
        for(int i=0; i<=1000; i++){
            counter.add(i);
        }
    }
}
