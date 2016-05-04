package Tests.Practice2Tests;

import Practice2.SetZero;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetZeroTest {

    SetZero setZero = new SetZero();

    @Test
    public void set1() throws Exception {
        int num = 6;
        int i = 2;
        int expected = 4;

        int actual = setZero.set(num, i);

        assertEquals(expected, actual);
    }

    @Test
    public void set2() throws Exception {
        int num = 3;
        int i = 1;
        int expected = 2;

        int actual = setZero.set(num, i);

        assertEquals(expected, actual);
    }

    @Test
    public void set3() throws Exception {
        int num = 3;
        int i = 5;
        int expected = 3;

        int actual = setZero.set(num, i);

        assertEquals(expected, actual);
    }

    @Test
    public void set4() throws Exception {
        int num = -1;
        int i = 31;
        int expected = -1073741825;

        int actual = setZero.set(num, i);

        assertEquals(expected, actual);
    }
}