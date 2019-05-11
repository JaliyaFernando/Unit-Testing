package myTestPackage3;

public class testFactorial {

	public static void main(String[] args) {
		factorial fact = new factorial();
		
		int actualOutput = fact.fact(5);
		int expectedOutput = 120;
		
		if(actualOutput == expectedOutput) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
	}

}
