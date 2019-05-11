package myTestPackage1;

public class fibonacciSeries {
	public int fibRec(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        } else {
            return fibRec(num - 1) + fibRec(num - 2);
        }
    }
}
