package Practice1;

//        Обійти матрицю "змійкою" і повернути всі числа в одномірному масиві.
//        Наприклад:
//        Для
//        [[ 1, 2, 3 ],
//         [ 4, 5, 6 ],
//         [ 7, 8, 9 ]]
//        повернути
//        [1, 4, 7, 8, 5, 2, 3, 6, 9]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        ArrayList<Integer> snake = new ArrayList<>();
        int num = 0;
        int length = 0;
        do {
            ArrayList<Integer> tmpList = new ArrayList<>();
            for (int i = 0; i < input.length; i++) {
                for (int k = num; k < input[i].length; k++) {
                    length = input[i].length;
                    tmpList.add(input[i][k]);
                    break;
                }
            }
            if (num % 2 == 0) {
                snake.addAll(tmpList);
            } else {
                Collections.reverse(tmpList);
                snake.addAll(tmpList);
            }
            num += 1;
        } while (num < length + 1);

        int[] ret = new int[snake.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = snake.get(i).intValue();
        }

        return ret;
    }
}