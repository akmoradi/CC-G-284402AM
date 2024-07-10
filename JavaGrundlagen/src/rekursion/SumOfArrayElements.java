package rekursion;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int[] zahlen = {1, 2, 3, 4, 5};
		int summe = summeArray(zahlen, 0);
		System.out.println("Die Summe der Elemente im Array ist: " + summe);

	}
	
	public static int summeArray(int[] array, int index) {
		// Base Case
		if (index == array.length) {
			return 0;
		}
		// Recursive Case
		return array[index] + summeArray(array, index + 1);
		
	}

}
