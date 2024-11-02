package mycalc;

public class Calculator {
    public double add(double a, double b) {
        return a+b;
    }
    public double sub(double a, double b) {
        return a-b;
    }
    public double mult(double a, double b) {
        return a*b;
    }
//    public double div(double a, double b) {
//        return a/b;
//    }
    public double div(double a, double b) throws DivByZeroException{
        if(b==0.0) throw new DivByZeroException ("Division by Zero");
        return a/b;
    }
}
