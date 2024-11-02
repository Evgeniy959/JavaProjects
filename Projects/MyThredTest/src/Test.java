public class Test extends Thread {
    public void run() {
        for (int i=0; i<3; i++ ) {
            System.out.print("A");
            System.out.print("B");
        }
    }
}

class ThreadDemo extends Thread {
    public void run() {
        for (int i=0; i<3; i++ ) {
            System.out.print("C");
            System.out.print("D");
        }
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        ThreadDemo t2 = new ThreadDemo();
        t1.start();
        t2.start();
        //System.out.println("Hello world!");
    }
}