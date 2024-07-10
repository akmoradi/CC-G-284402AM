package rekursion;

public class Fibonacci {

	public static void main(String[] args) {
		
		int number = 7;
		System.out.println("Fibonacci of (" + number +") is: " + fibonacci(number));

	}
	
	public static int fibonacci(int number) {
		//Base Case
		if (number <= 1) {
			return number;
		}
		
		// Recursive Case
		return fibonacci (number - 1) + fibonacci (number -2);
	}

}

