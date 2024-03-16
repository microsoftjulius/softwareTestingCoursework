package ug.ac.mak.se23day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void evaluateTest() {
        int sum = App.evaluate("2+3+4");
        assertEquals(9, sum);
    }
}
