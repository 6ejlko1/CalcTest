package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class calcTest {
    Calculator calculator = new Calculator();

    @Test
    public void testPlus() {
        int result = calculator.instance.get().plus.apply(3, 5);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testMinus() {
        int result = calculator.instance.get().minus.apply(3, 5);
        Assertions.assertEquals(-2, result);
    }

    @Test
    public void testDevide() {
        int result = calculator.instance.get().devide.apply(10, 5);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDevideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.instance.get().devide.apply(5, 0);
        });
    }

    @Test
    public void testMultyply() {
        int result = calculator.instance.get().multiply.apply(3, 5);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testAbs() {
        int result = calculator.instance.get().abs.apply(-3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testPow() {
        int result = calculator.instance.get().pow.apply(5);
        Assertions.assertEquals(25, result);
    }
}

