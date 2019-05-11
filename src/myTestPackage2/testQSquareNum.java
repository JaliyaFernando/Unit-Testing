package myTestPackage2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testQSquareNum {

	public static void main(String[] args) {
		squareNum sq = new squareNum();
		int actualOutput = sq.square(2);
		int expectedOutput = 4;
		
		if(actualOutput == expectedOutput) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}
	
	@Test
	public void test() {
		squareNum sq = new squareNum();
		int actualOutput = sq.square(2);
		int expectedOutput = 4;
		
		assertEquals(actualOutput, expectedOutput);
	}


}
