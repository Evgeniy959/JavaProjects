import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        MyThread1 t1=new MyThread1();
//        //t1.setDaemon(true);
//        //t1.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
////        while(true){
////            System.out.print(".");
////        }
//        int laps=10000;
//        while(laps>0){
//            System.out.print(".");
//            laps--;
//        }
//        System.out.println("Hello world!");
//        int v = (new Random()).nextInt(10);
//        MyThread2 t2=new MyThread2(v);
//        //t2.setDaemon(true);
//        v = (new Random()).nextInt(10);
//        MyThread2 t3=new MyThread2(v);
//        //t3.setDaemon(true);
//        t2.start();
//        t3.start();
        int v = (new Random()).nextInt(10);
        MyThread3 r4=new MyThread3(v);
        Thread t4 = new Thread(r4);
        t4.setDaemon(true);
        v = (new Random()).nextInt(10);
        MyThread3 r5=new MyThread3(v);
        Thread t5 = new Thread(r5);
        t5.setDaemon(true);
        t4.start();
        t5.start();
        try {
            t4.join();
            t5.join();
        } catch (InterruptedException ex) {
        }
    }
}



