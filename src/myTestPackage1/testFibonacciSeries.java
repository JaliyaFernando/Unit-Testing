package myTestPackage1;

public class testFibonacciSeries {

	public static void main(String[] args) {
		fibonacciSeries fibonacci = new fibonacciSeries();
		int actualoutput = fibonacci.fibRec(10);
		int expectedoutput = 5;
		
		if(actualoutput == expectedoutput) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test Failed");
		}
		
	}

}
