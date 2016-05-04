package Tests.Practice2Tests;

import Practice2.CountBits;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountBitsTest {

    CountBits countBits = new CountBits();

    @Test
    public void testCount() throws Exception {
        int num = 13;
        int expected = 3;

        int actual = countBits.count(num);

        assertEquals(expected, actual);
    }
}