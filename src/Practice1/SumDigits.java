package Practice1;

//        Обчислити суму цифр числа.
//        Наприклад сума цифр числа 123 дорівнює  6.

public class SumDigits {
    public int sum(int number) {
        int sum=0;
        int tmp;
        while (number!=0){
            tmp = number%10;
            sum += tmp;
        number/=10;}
        return sum;
    }
}