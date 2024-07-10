package grundlagen;

import java.util.Scanner;

public class PositiveZahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number;
		
		System.out.println("Geben Sie eine Zahl ein");
		number = scanner.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Gerade");
		}
		else {
			System.out.println("Ungerade");
		}
		
		scanner.close();

	}

}
