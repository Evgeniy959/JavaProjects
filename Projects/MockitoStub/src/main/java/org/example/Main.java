package org.example;

import org.example.businessLogic.MyCalc;
import org.example.data.MyCalcService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyCalcService myCalcService = ((a, b) -> a/b);
        MyCalc myCalc = new MyCalc(myCalcService);
        System.out.println(myCalc.myDiv(5, 0));
    }
}