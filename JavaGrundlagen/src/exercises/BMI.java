package exercises;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name? ");
		String name = scanner.next();
		System.out.println("Name: " + name);
		
		System.out.println("What's your weight? ");
		double weight = scanner.nextDouble();
		System.out.println("Weight: " + weight);
		
		System.out.println("What's your height? ");
		double height = scanner.nextDouble();
		System.out.println("Height: " + height);
		
		double bmi = weight / (height * height);
		System.out.println("Hello " + name);
		//System.out.println("Your BMI is: " + bmi);
		
		System.out.println("Your BMI is: " + Math.round(bmi));
		
		scanner.close();

	}

}
