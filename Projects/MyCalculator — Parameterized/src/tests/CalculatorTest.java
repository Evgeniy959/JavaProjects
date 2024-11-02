package tests;

import mycalc.Calculator;
import mycalc.DivByZeroException;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private double num1;
    private double num2;
    private double expectedResult;
    private static Calculator calc;
    public CalculatorTest(double num1, double num2,
                          double expectedResult) {
        this.num1 = num1;
        this.num2 = num2;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters(name = "{index}:mult({0},{1})= {2}")
    public static Collection<Object[]> dataForTests(){
        return Arrays.asList(new Object[][] {
                {2,3,6},{2,7,14},{0,3,0}});
    }
    @BeforeClass
    public static void setUp() {
        calc=new Calculator();
    }
    @Test
    public void testMult() {
        double result=calc.mult(num1,num2);
        assertEquals(expectedResult, result,1e-9);
    }
}