public class IncThread extends Thread{
    int limit;
    public IncThread(int limit)
    {
        this.limit=limit;
    }
    public void run(){
        for(int i=0; i<limit; i++)
        {
            synchronized(Treadtest.locker){
                Treadtest.counter++;
            }
        }
    }
}
