package grundlagen;

import java.util.Scanner;

public class KapitalBerechnung {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Eingabe
		System.out.print("Anzulegendes Kapital: ");
		double kapital = scanner.nextDouble();
		System.out.println("Zinssatz (in %): ");
		double zinssatz = scanner.nextDouble();
		System.out.println("Laufzeit (in Jahren): ");
		int laufzeit = scanner.nextInt();
		
		// Umrechnung des Zinssatzes in Dezimalform
		double z = zinssatz / 100.0;
		
		// Berechnung und Ausgabe für jedes Jahr
		for (int jahr = 1; jahr <= laufzeit; jahr++) {
			kapital = kapital + kapital * z;
			System.out.println("Jahr" + jahr + ": Kapital = " + Math.round(kapital * 100.0) / 100.0);
		}

		scanner.close();

	}

}
