package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solvertest {
    Solver solver;
    @Before
    public void setUpEachTest() {
        solver = new Solver();
    }
    @Test
    public void checkDiscriminantPositive() {
        int result = solver.squareNumbers(1,60,2);
        Assert.assertEquals(2,result);
    }
    @Test
    public void checkDiscriminantNegative() {
        int result = solver.squareNumbers(3,5,7);
        Assert.assertEquals(0, result);
    }
    @Test
    public void checkDiscriminantZero() {
        int result = solver.squareNumbers(11,22,11);
        Assert.assertEquals(1,result);
    }
}
