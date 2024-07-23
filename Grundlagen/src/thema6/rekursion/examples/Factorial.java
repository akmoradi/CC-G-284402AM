package thema6.rekursion.examples;

public class Factorial {

	public static void main(String[] args) {
	
		int number = 3;
		System.out.println(number + "! " + factorial(number));
	}

	public static int factorial(int n) {
		if(n == 1) 
			return 1;
		
		return n * factorial(n -1);
	}
}
