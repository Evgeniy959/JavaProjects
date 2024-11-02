import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyReader implements Runnable{
    FileReader fr = null;
    Object locker;
    public MyReader(String filePath, Object locker)
    {
        try {
            this.fr = new FileReader(filePath);
            this.locker=locker;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyReader.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void run() {
        int lineCounter=0;
        String str="";
        BufferedReader br = new BufferedReader(fr);
        try {
            while((str = br.readLine()) != null) {
                System.out.println("Reader:"+str);
                if( (lineCounter++) % 2 == 0) {
                    synchronized(locker){
                        TestSynchro.line=str;
                        locker.notify();
                        locker.wait();
                    }
                }
            }
            synchronized(locker){
                TestSynchro.line="exit";
                locker.notify();
                locker.wait();
            }
        } catch (IOException ex) {
            Logger.getLogger(MyReader.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyReader.class.getName()).
                    log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(MyReader.class.
                                getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
