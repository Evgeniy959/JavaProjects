class Test implements Runnable {
    int x = 0, y = 0;
    int addX(){
        x++;
        return x;
    }
    int addY(){
        y++;
        return y;
    }
    //@Override
    public void run() {
        for (int i =0; i<10; i++)
            System.out.println(Thread.currentThread().getName()+ ": " + addX()+ " " + addY());

    }
    public static void main(String[] args) {
        Test obJ1 = new Test();
        Test obJ2 = new Test();
        Thread t1 = new Thread(obJ1);
        Thread t2 = new Thread(obJ2);
        t1.start();
        t2.start();
    }


}