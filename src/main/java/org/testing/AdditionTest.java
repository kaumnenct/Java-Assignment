package org.testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdditionTest {
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void testAdditionOfIntegers() {
        assertEquals(addTwoNumbers.TwoIntegers(1, 2), 3);
    }

    @Test
    public void testAdditionOfDoubles() {
        assertEquals(addTwoNumbers.TwoDoubles(1.2, 1.5), 2.7, 0.1);
    }
    @Test
    public void testAdditionOfDoubleAndInt() {
        assertEquals(addTwoNumbers.DoubleAndInt(1.5, 2), 3.5, 0.1);
    }
}
