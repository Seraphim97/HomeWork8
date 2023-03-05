package org.example;

import static jdk.nashorn.internal.objects.Global.Infinity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CalcTest {
    Calculator calculator;

    @Before
    public void setUpEachTest() {
        calculator = new Calculator();

    }

    @Test
    public void divisionPositiveNumbers() {
        double result = calculator.division(8.8,2.5);
        Assert.assertEquals(3.520,result,0.001);
    }

    @Test
    public void divisionNegativeNumbers(){
        double result = calculator.division(-9.9, -3.3);
        Assert.assertEquals(3.0, result, 0.001);
    }

    @Test
    public void divisionZeroDividend() {
        double result = calculator.division(0, 5.5);
        Assert.assertEquals(0,result,0.001);

    }

    @Test
    public void divisionZeroDivisor() {
        double result = calculator.division(5.5,0);
        Assert.assertEquals( Infinity, result, 0.001);
    }

    @Test
    public void multiplicationPositiveNumbers() {
        double result = calculator.multiplication(4.5, 3.4);
        Assert.assertEquals(15.299, result, 0.001);
    }

    @Test
    public void multiplicationNeganiveNumbers() {
        double result = calculator.multiplication(-7.7,-3.3);
        Assert.assertEquals(25.41,result,0.001);
    }

    @Test
    public void multiplicationZero() {
        double result = calculator.multiplication(0, 6.6);
        Assert.assertEquals(0, result, 0.001);

    }
}
