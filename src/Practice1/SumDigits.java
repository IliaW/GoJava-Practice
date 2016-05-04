package Practice1;

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
