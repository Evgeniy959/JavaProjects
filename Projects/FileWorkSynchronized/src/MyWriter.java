import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyWriter implements Runnable{
    FileWriter fw = null;
    Object locker;
    public MyWriter(String filePath, Object locker)
    {
        try {
            this.fw = new FileWriter(filePath,true);
            this.locker=locker;
        } catch (IOException ex) {
            Logger.getLogger(MyWriter.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void run() {
        synchronized(locker){
            while(TestSynchro.line != "exit")
            {
                try {
                    locker.wait();
                    if(TestSynchro.line != "exit"){fw.write(TestSynchro.line +
                            System.getProperty("line.separator"));
                    }
                    System.out.println("*** Written line:" + TestSynchro.line);
                    locker.notify();
                } catch (IOException ex) {
                    Logger.getLogger(MyWriter. class.
                                    getName()).
                            log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyWriter.class.
                                    getName()).
                            log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(MyWriter.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }
}
