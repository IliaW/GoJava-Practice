package Tests.Practice2Tests;

import Practice2.AbcNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbcNumberTest {

    AbcNumber abcNumber = new AbcNumber();

    @Test
    public void convert() throws Exception {
        String string = "bcd";
        int expected = 123;

        int actual = abcNumber.convert(string);

        assertEquals(expected, actual);
    }
}