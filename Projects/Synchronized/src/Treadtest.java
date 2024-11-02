import java.util.logging.Level;
import java.util.logging.Logger;

public class Treadtest {
    public static int counter=0;
    public static Object locker=new Object();
    public static void main(String[] args) {
        //System.out.println("Hello world!");
            int limit = 1000000;
            IncThread t6=new IncThread(limit);
            DecThread t7=new DecThread(limit);
            t6.start();
            t7.start();
            try {
                t6.join();
                t7.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                Logger.getLogger(Treadtest.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
            System.out.println("counter="+counter);
    }
}