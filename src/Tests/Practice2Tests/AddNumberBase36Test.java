package Tests.Practice2Tests;

import Practice2.AddNumberBase36;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumberBase36Test {

    AddNumberBase36 addNumberBase36 = new AddNumberBase36();

    @Test
    public void add() throws Exception {
        String a = "9";
        String b = "1";
        String expected = "a";

        String actual = addNumberBase36.add(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void addTwo() throws Exception {
        String a = "z";
        String b = "1";
        String expected = "10";

        String actual = addNumberBase36.add(a, b);

        assertEquals(expected, actual);
    }
}