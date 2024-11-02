public class MyThread2 extends Thread {
    private int value;
    public MyThread2(int v)
    {
        this.value=v;
    }
    public void run(){
        while(this.value >=0){
            System.out.println("*** The thread "
                    +Thread.currentThread().getName()+
                    " started with " +this.value);
            while(this.value >=0){
                System.out.println("From "
                        +Thread.currentThread().getName()+
                        " value =" +this.value);
                this.value-=1;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                }
            }
            System.out.println("*** The thread "
                    +Thread.currentThread().getName()+
                    " has finished");
        }
    }
}
