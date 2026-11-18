package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class MainTest {
    @Test
    public void testadd(){
        assertEquals(30,Main.add(20,10));
    }
    @Test
    public void testsub(){
        assertEquals(10,Main.add(20,10));
    }
    @Test
    public void testmul(){
        assertEquals(200,Main.add(20,10));
    }
    @Test
    public void testdiv(){
        assertEquals(2.0,Main.add(20,10),0.001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        Main.divide(20, 0);
    }
}
