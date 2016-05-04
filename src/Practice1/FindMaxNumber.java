package Practice1;

//        Знайти максимальне число в масиві.
//        Гарантується, що масив завжди не пустий.

public class FindMaxNumber {
    public int max(int[] input) {
        int maxnum = input[0];
        for (int i = 0; i < input.length; i++) {
            if (maxnum < input[i]) {
                maxnum = input[i];
            }
        }
        return maxnum;
    }
}