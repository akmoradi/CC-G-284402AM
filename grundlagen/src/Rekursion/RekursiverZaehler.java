package Rekursion;

public class RekursiverZaehler {
	
	public static void main(String[] args) {
		// Starting the recursive counter with an initial value
		rekursiverZaehler(1);
	}
	
	public static void rekursiverZaehler(int counter) {
		System.out.println(counter);
		if (counter < 6) {
			rekursiverZaehler(counter + 1);
		}
		System.out.println("Cheerio von Counter = " + counter);
	}

}


