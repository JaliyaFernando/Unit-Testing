package myTestPackage1;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		fibonacciSeries fibonacci = new fibonacciSeries();
		int actualoutput = fibonacci.fibRec(10);
		int expectedoutput = 55;
		
		assertEquals(actualoutput, expectedoutput);
		
		
	}

}
