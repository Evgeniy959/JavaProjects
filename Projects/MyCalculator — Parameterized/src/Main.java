import mycalc.Calculator;
import mycalc.DivByZeroException;

public class Main {
    public static void main(String[] args) throws DivByZeroException {
        System.out.println("Hello world!");
        Calculator calc = new Calculator();
        //calc.div(5, 2);
        System.out.println("div"+"="+calc.div(5, 2));
        System.out.printf("div = %f", calc.div(5, 2));
        System.out.println();
        System.out.println("div"+"="+calc.div(5, 0));
    }
}