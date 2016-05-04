package Tests.Practice1Tests;

import Practice1.MatrixSnakeTraversal;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSnakeTraversalTest {

    MatrixSnakeTraversal mst = new MatrixSnakeTraversal();

    @Test
    public void testPrint() throws Exception {

        int[][] mas = {{1, 2,  },
                {3, 4, },};
        mst.print(mas);
    }
}