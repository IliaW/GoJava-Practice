package Tests.Practice2Tests;

import Practice2.AddBinary;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {

    AddBinary addBinary = new AddBinary();

    @Test
    public void add1() throws Exception {
        String a = "101";
        String b = "100";
        String expected = "1001";

        String actual = addBinary.add(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void add2() throws Exception {
        String a = "10000000000000000000000000000000";
        String b = "10000000000000000000000000000000";
        String expected = "100000000000000000000000000000000";

        String actual = addBinary.add(a, b);

        assertEquals(expected, actual);
    }
}