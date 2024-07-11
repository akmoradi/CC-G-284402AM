package rekursion;

public class Faktorial {

	public static void main(String[] args) {
		
		int number = 9;
		System.out.println(number + "! is: " + factorial(number));

	}
	
	public static int factorial(int number) {
		
		if (number <= 1) {
			return 1;
		}
		
		return number * factorial(number - 1);
	}

}
