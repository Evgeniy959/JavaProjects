public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double d = 1.1;
        double dl = 1.3;
        float f = 2.2F;

        f= (float)d*2;
        float fl= (float)dl*2;
        System.out.printf("%.1f, %.2f", f, fl);
    }
}