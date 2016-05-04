package Practice2;

//        Дано число. Треба замінити i-й біт замінити на нуль.
//        Наприклад:
//        для числа 6 в бінарному вигляді 110,
//        замінивши 2-й біт на нуль отримаємо 100 тобто 4.
//        1<= i <= 32

public class SetZero {
    public int set(int num, int i) {
        String binaryString = Integer.toBinaryString(num);
        char[] binary = binaryString.toCharArray();
        try {
            binary[binary.length - i] = '0';
            String resultBinaryString = "";
            for (char c : binary) resultBinaryString += c;
            int result;
            if (num >= 0) {
                result = Integer.parseInt(resultBinaryString, 2);
            } else {
                result = Integer.parseInt("-" + resultBinaryString.substring(1), 2)-2;
            }
            return result;
        } catch (ArrayIndexOutOfBoundsException e) {
            return num;
        }
    }

}
