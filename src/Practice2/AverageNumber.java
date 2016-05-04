package Practice2;

//        Знайти середнє значення двох цілих чисел.
//        Приклади:
//        average( 4, 6 ) = 5
//        average( -4, -7 ) = -5
//        average( -4, 7 ) = 1

public class AverageNumber {
    public int average(int a, int b) {
        long a2 = a;
        long b2 = b;
        return (int) ((a2 + b2) / 2);
    }
}
