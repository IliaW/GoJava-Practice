package Tests.Practice2Tests;

import Practice2.PositiveAverageNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveAverageNumberTest {

    PositiveAverageNumber positiveAverageNumber = new PositiveAverageNumber();

    @Test
    public void testAverage() throws Exception {
        int a = 2;
        int b = 4;
        int expected = 3;

        int actual = positiveAverageNumber.average(a, b);

        assertEquals(expected, actual);
    }
}