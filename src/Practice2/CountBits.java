package Practice2;

//        Для даного числа порахувати кількість біт.
//        Наприклад:
//        Для числа 13 в бінарному вигляді 1101 повернути 3.

public class CountBits {
    public int count(int num) {
        String binary = Integer.toBinaryString(num);
        char[] charArray = binary.toCharArray();
        int result = 0;
        for (char c : charArray) {
            if (c == '1') result += 1;
        }

        return result;
    }
}
