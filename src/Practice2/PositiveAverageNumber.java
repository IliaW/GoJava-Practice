package Practice2;

//        Знайти середнє арифметике двух додатніх чисел.
//        Наприклад:
//        average( 2, 4 ) = 3
//        average( 4, 7 ) = 5

public class PositiveAverageNumber {
    public int average(int a, int b) {
        long a2 = a;
        long b2 = b;
        return (int)((a2 + b2) / 2);
    }
}
