package Practice2;

//        Додайте два беззнакових числа, що передаються як рядки.
//        "101" + "100" = "1001"

public class AddBinary {
    public String add(String a, String b) {
        String sum = new String();
        int carry = 0, i;
        if (a.length() < b.length()) {
            while (a.length() < b.length())
                a = 0 + a;
        } else if (b.length() < a.length()) {
            while (b.length() < a.length())
                b = 0 + b;
        }
        for (i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                sum = carry + sum;
                carry = 0;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (carry == 0)
                    sum = '0' + sum;
                else
                    sum = '1' + sum;
                carry = 1;
            } else if (a.charAt(i) == '1' || b.charAt(i) == '1') {
                if (carry == 0)
                    sum = '1' + sum;
                else {
                    sum = '0' + sum;
                    carry = 1;
                }
            }
        }
        if (carry == 1)
            sum = '1' + sum;

        return sum;
    }
}