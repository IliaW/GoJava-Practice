package Practice1;

//        Знайти перше непарне число і повернути його індекс.
//        Якщо такого немає, повернути -1

public class FirstOddNumber {
    public int find(int[] input) {
        int result = -1;
        for (int i : input) {
            while (input[i] % 2 != 0) {
                result = i;
            }
        }
        return result;
    }
}