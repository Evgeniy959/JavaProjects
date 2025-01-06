public class Test implements Runnable {
    String x, y;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                x = "Hello";
                y = "Java";
                System.out.print(x + " " + y + " ");
            }

        }
    }
    public static void main(String[] args) {
        Test run = new Test();
        Thread obj1 = new Thread(run);
        Thread obj2 = new Thread(run);
        obj1.start();
        obj2.start();
    }


}