import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCallable {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
//        int num=1; //number of threads
//        ThreadPoolExecutor executor =
//                (ThreadPoolExecutor) Executors.
//                        newFixedThreadPool(num);
//        MyCallable mc = new MyCallable (1, 10);
//        Future<Integer> result = executor.submit(mc);
//        try {
//            System.out.println("Result is: " + result.get());
//            System.out.println("And task completion status is " + result.isDone());
//            executor.shutdown();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestCallable.class.getName()).
//                    log(Level.SEVERE, null, ex);
//        } catch (ExecutionException ex) {
//            Logger.getLogger(TestCallable.class.
//                    getName()).log(Level.SEVERE, null, ex);
//        }
//--------------------------------------------------------------------------------------------------
//        int num=10; //number of threads
//        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(num);
//        //create list to keep the results from all the threads
//        List<Future<Integer>> results = new ArrayList<>();
//        Random r = new Random();
////process all the 10 threads in the loop
//        for (int i=0; i<num; i++)
//        {
//            int b=r.nextInt(10); //generate random interval
//            int e=r.nextInt(100)+10; //
//            System.out.println("Limits:"+b+" to "+e);
//            MyCallable mc = new MyCallable (b,e); //create
////Callable
//            Future<Integer> result = executor.submit(mc); //
////launch the thread
//            results.add(result); //add received result in the list
//        }
//        System.out.println("Results: ");
//        try {
////show the results from all the threads
//            for(Future<Integer> result : results){
//                System.out.println("Result is: " + result.get());
//            }
//            executor.shutdown();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestCallable.class.getName()).
//                    log(Level.SEVERE, null, ex);
//        } catch (ExecutionException ex) {
//            Logger.getLogger(TestCallable.class.getName()).
//                    log(Level.SEVERE, null, ex);
//        }
//------------------------------------------------------------------------------------------
//        int num=10; //number of threads
//        ThreadPoolExecutor executor =
//                (ThreadPoolExecutor) Executors.
//                        newFixedThreadPool(num);
////collection to keep created callables
//        Set<Callable<String>> callables =
//                new HashSet<Callable<String>>();
//        Random r = new Random();
////fill the collection in the loop
//        for (int i=0; i<num; i++){
//            MyStringCallable mc =
//                    new MyStringCallable(r.nextInt(1000));
//            callables.add(mc);
//        }
//        String result="";
//        try {
////launch a random thread out of 10
//            result = executor.invokeAny(callables);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestCallable.class.getName()).
//                    log(Level.SEVERE, null, ex);
//        } catch (ExecutionException ex) {
//            Logger.getLogger(TestCallable.class.getName()).
//                    log(Level.SEVERE, null, ex);
//        }
//        finally{
//            executor.shutdown();
//        }
////show the name of the launched thread
//        System.out.println("Received from callable: " + result);
//--------------------------------------------------------------------------------------------
        int num=10; //number of threads
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.
                        newFixedThreadPool(num);
//collection to keep created callables
        Set<Callable<String>> callables =
                new HashSet<Callable<String>>();
        Random r = new Random();
//fill the collection in the loop
        for (int i=0; i<num; i++){
            MyStringCallable mc =
                    new MyStringCallable(r.nextInt(1000));
            callables.add(mc);
        }
//another collection to keep the results from all
//the threads
        List<Future<String>> results=null;
        try {
            results = executor.invokeAll(callables);
            for(Future<String> result: results){
                System.out.println("Received from callable: " + result.get());
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TestCallable.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(TestCallable.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        finally{
            executor.shutdown();
        }
    }
}