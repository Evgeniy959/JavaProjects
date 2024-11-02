public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(factorial(5));
        for (int i = 0; i <= 6; i++) {
            System.out.print(fibonachi(i));

        }
        System.out.println();
        System.out.println(fibonachi(7));
        printA(5);
        System.out.println();
        recA(5);
        System.out.println();
        System.out.println(degree(4,2));

    }
    static int factorial(int x){

        if (x == 1){

            return 1;
        }
        //System.out.print(x+"*");
        return x * factorial(x - 1);
    }

    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    static void printA(int n){
        while (n>=1){
            System.out.print(n+" ");
            n-=1;
        }
    }

    static void recA(int n){
        if (n>=1){
            //recA(n-1);
            System.out.print(n+" ");
            recA(n-1);
        }
    }
    static boolean IsPrimeNumber(int n){
        int k = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                k++;
            }

        }
        if (k == 1) {
            return true;
        }
        return false;

    }
    static int degree(int x, int y){
        if (y == 0)
        return 1;
        if (y == 1)
        return x;
     // оставшиеся кейсы, когда степень > 1
        if (y != 1) {
            return x * degree(x, y - 1);
        }
        return 0;
    }
}