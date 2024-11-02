public class MyResource {
    long counter = 0;
    public synchronized void add(long value){
        this.counter += value;
    }
    long getCounter(){
        return this.counter;
    }
}
