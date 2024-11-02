import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSynchro {
    public static String line="";
    public static void main(String[] args) {
        CreateFile.FileReader();
        CreateFile.FileOut();
        Object locker=new Object(); //synchronizing
//object
        MyReader reader = new MyReader("test/lines.txt",locker);
                MyWriter writer = new MyWriter("test/lines_out.txt",locker);
                Thread t1 = new Thread(reader); // thread
// reader
        Thread t2 = new Thread(writer); // thread
// writer
        t1.setDaemon(true);
        t2.setDaemon(true);
        t2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestSynchro.
                            class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        t1.start();
        try { // wait for both threads to complete
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            Logger.getLogger(TestSynchro.
                            class.getName()).
                    log(Level.SEVERE, null, ex);
        }

    }
}