class Test extends Thread {
    Test(){

    }
    Test(Runnable r){
        super(r);

    }
    public void run(){
        System.out.print("Inside Thread ");
    }
}
class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.print(" Inside Runnable");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new Test().start();
        new Test(new RunnableDemo()).start();
    }
}