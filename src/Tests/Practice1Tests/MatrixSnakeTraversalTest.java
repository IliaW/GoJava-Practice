package Tests.Practice1Tests;

import Practice1.MatrixSnakeTraversal;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSnakeTraversalTest {

    MatrixSnakeTraversal mst = new MatrixSnakeTraversal();

    @Test
    public void testPrint() throws Exception {

        int[][] array = {
                {1, 2,},
                {3, 4,},
        };
        mst.print(array);
        int[] expected = {1, 3, 4, 2,};

        assertEquals(array, expected);
    }
}