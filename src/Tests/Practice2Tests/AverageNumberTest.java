package Tests.Practice2Tests;


import Practice2.AverageNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageNumberTest {

    AverageNumber averageNumber = new AverageNumber();

    @Test
    public void average1() throws Exception {
        int a = 4;
        int b = 6;
        int expected = 5;

        int actual = averageNumber.average(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void average2() throws Exception {
        int a = -4;
        int b = -7;
        int expected = -5;

        int actual = averageNumber.average(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void average3() throws Exception {
        int a = -4;
        int b = 7;
        int expected = 1;

        int actual = averageNumber.average(a, b);

        assertEquals(expected, actual);
    }
}