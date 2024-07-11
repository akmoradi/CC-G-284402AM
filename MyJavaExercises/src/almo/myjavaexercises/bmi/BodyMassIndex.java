package almo.myjavaexercises.bmi;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user for height and weight
		System.out.print("Enter height in meters: ");
		double height = sc.nextDouble();
		
		System.out.print("Enter weight in kilograms: ");
		double weight = sc.nextDouble();
		
		//Calculate BMI
		double bmi = weight / (height * height);
		
		//Print the BMI
		System.out.print("Your BMI is: " + bmi);
		
		//Close the scanner
		sc.close();
	}

}
