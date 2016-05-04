package Practice1;

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