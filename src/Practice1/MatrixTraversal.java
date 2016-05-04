package Practice1;

//        Обійти матрицю по спіралі і записати всі числа в одмірний масив.
//        Для матриці
//        {1, 2, 3, 4, 5},
//        {6, 7, 8, 9, 10},
//        {11, 12, 13, 14, 15},
//        {16, 17, 18, 19, 20},
//        {21, 22, 23, 24, 25}
//        вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MatrixTraversal {
    public int[] print(int[][] input) {
        Set<Integer> array = new LinkedHashSet<>();

        int num = 0;
        for (int i = 0; i < input.length; i++) {
            for (int h = 0 + num; h < input[i].length - num; h++) {
                array.add(input[i][h]);
                if (h == input[i].length - 1 - num) {
                    for (int c = 0 + num; c < input.length - num; c++) {
                        array.add(input[c][h]);
                        if (c == input.length - 1 - num) {
                            for (int d = input[i].length - 1 - num; d >= 0 + num; d--) {
                                array.add(input[c][d]);
                                if (d == 0 + num) {
                                    for (int f = input.length - 1 - num; f >= 0 + num; f--) {
                                        array.add(input[f][d]);
                                    }
                                }
                            }
                        }
                    }
                    num += 1;
                }
            }
        }
        List<Integer> newList = new ArrayList<>(array);
        int[] ret = new int[newList.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = newList.get(i);
        }
        return ret;
    }
}