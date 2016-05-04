package Practice2;

//        Дано рядок отриманий шляхом заміни цифр 0,1,2,...,9 певного числа на букви a,b,c,..,j.
//        Необхідно повернути початкове число маючи конвертований рядок.
//        Наприклад:
//        Для "bcd" повернути 123

public class AbcNumber {
    public int convert(String num) {
        char[] charArray = num.toCharArray();
        int result = 0;
        for (int i = 0; i < charArray.length; i++) {
            result = result * 10 + (charArray[i] - 'a');
        }

        return result;
    }
}