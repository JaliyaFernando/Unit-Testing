package myTestPackage3;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		factorial fact = new factorial();
		
		int actualOutput = fact.fact(5);
		int expectedOutput = 120;
		
		assertEquals(expectedOutput, actualOutput);
		
	}

}
