package arrays;

import java.util.Arrays;
import java.util.Random;

public class EinfacheArrays {

	public static void main(String[] args) {
		
		// Array Sum
		Integer [] numbers = {1, 5, 10, 25};
		int sum = 0;
				
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
			
		
		System.out.println("Die Summe der Array-Elemente ist: " + sum);
		
		// Array Even: Enthält nur gerade (Zufällige) Zahlen
		int[] evenArray = new int[20];
		Random rand = new Random();
		for (int j = 0; j < evenArray.length; j++) {
			evenArray[j] = rand.nextInt(50) * 2; // Generiert zufällige gerade Zahlen
		
		}
		System.out.println("Even Array: " + Arrays.toString(evenArray));
		
		// Array Sort: Enthält ganze (zufällige) Zahlen, die aufwärts sortiert sind
		int[] sortedArray = new int[20];
		for (int h = 0; h < sortedArray.length; h++) {
			sortedArray[h] = rand.nextInt(100); // Generiert zufällige ganze Zahlen
			
		}
		Arrays.sort(sortedArray);
		System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
		

	}
	

}
