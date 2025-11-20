package com.jntu.calc;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(15, c.add(10, 5));
    }

    @Test
    public void testSubtract() {
        Calculator c = new Calculator();
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        assertEquals(50, c.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        Calculator c = new Calculator();
        assertEquals(2.0, c.divide(10, 5), 0.01);
    }
}
