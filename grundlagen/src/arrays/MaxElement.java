package arrays;

public class MaxElement {

	public static void main(String[] args) {
		int[] array = {1, 3, 7, 0, 5};
		int max = findMax(array);
		System.out.println("Größtes Element: " + max);

	}
	
	public static int findMax(int[] array) {
		int max = array[0];
		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}
		
		return max;
	}

}
