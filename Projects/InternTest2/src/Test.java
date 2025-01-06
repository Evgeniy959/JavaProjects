public class Test extends Thread {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");
    }
    public void run() {
        System.out.print("Thread ");
    }

}