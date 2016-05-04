package Practice2;

//        Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
//        Повернути суму чисел, також в системі 36.
//        Наприклад:
//        "9" + "1" = "a"
//        "z" + "1" = "10"

import java.math.BigInteger;

public class AddNumberBase36 {

    public String add(String a, String b) {
        BigInteger b1 = new BigInteger(a, 36);
        BigInteger b2 = new BigInteger(b, 36);
        return b1.add(b2).toString(36);
    }
}
