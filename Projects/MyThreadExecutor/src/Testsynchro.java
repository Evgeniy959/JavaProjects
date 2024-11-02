import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Testsynchro {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
//        Thread tr = new Thread(()->System.out.println(Thread.currentThread().getName()+ " is working... "));
//        tr.start();
        //-------------------------------------------------------------------------
//        ExecutorService executor =
//                Executors.newSingleThreadExecutor();
//        executor.execute(() -> {
//            String threadName = Thread.currentThread().getName();
//            try {
//                Thread.currentThread().sleep(5000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Testsynchro.class.getName()).
//                        log(Level.SEVERE, null, ex);
//            }
//            System.out.println("Hello from " + threadName);
//        });
//        executor. execute(() -> {
//            String threadName = Thread.currentThread().getName();
//            System.out.println("Hello again from " + threadName);
//        });
//        executor.shutdown();

//        ExecutorService executor =
//                Executors.newSingleThreadExecutor();
//        Future future = executor.submit(new Runnable() {
//            public void run() {
//                String threadName = Thread.currentThread().
//                        getName();
//                System.out.println("This code is deing executed "
//                                + "asynchronously in thread " + threadName);
//            }
//        });
//        try {
////returns null if the task completed successfuly
//            if(future.get() == null)
//                System.out.println("Success!");
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Testsynchro.class.getName()).
//                    log(Level.SEVERE, null, ex);
//        } catch (ExecutionException ex) {
//            Logger.getLogger(Testsynchro.class.getName()).
//                    log(Level.SEVERE, null, ex);
//        }
//        executor.shutdown();
        ScheduledExecutorService executor =
                Executors.newScheduledThreadPool(1);
        Runnable task = new Runnable() {
            public void run() {
            System.out.println("Hello from "+Thread.
                    currentThread().getName());
        }
        };
        ScheduledFuture sf =
                executor.scheduleAtFixedRate(task, 0, 2,
                        TimeUnit.SECONDS);
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Testsynchro.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        sf.cancel(true);
        try {
            System.out.println("attempt to shutdown executor");
            executor.shutdown();
//wait 3 seconds for completion
            executor.awaitTermination(3, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        }
        finally {
//if service is not completed yet
            if (!executor.isTerminated()) {
                executor.shutdownNow();
                System.err.println("Make it to stop");
            }
            System.out.println("shutdown finished");
        }
    }
}