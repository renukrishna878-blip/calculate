
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAddition() {
        assertEquals(30, Main.add(20, 10));
    }

    @Test
    public void testSubtraction() {
        assertEquals(10, Main.subtract(20, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(200, Main.multiply(20, 10));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, Main.divide(20, 10), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        Main.divide(20, 0);
    }
}
