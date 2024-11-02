package org.example.businessLogic;

import org.example.data.MyCalcService;

public class MyCalc {
    private MyCalcService myCalcService;

    public MyCalc(MyCalcService myCalcService) {
        this.myCalcService = myCalcService;
    }

    public double myDiv(double a, double b) throws RuntimeException{
        return myCalcService.div(a, b);
    }
}
