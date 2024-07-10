package grundlagen;

import java.util.Random;
import java.util.Scanner;

public class GluecksSpielAutomat {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Willkommen beim Glückspiel!");
		
		System.out.println("Geben Sie Ihre Vermutung (eigene ganze Zahl zwischen 1 und 100 ein oder 's' zum Beenden.");
		String input = scanner.next();
		
		if(input.equals("s")) {
			System.out.println("Das Spiel wurde beendet. Vielen Dank fürs Spielen!");
		}
		
		else {
			random.nextInt(100);
			
			int generatedNumber = random.nextInt(100) + 1;
			System.out.println("Die generierte Zahl lautet: " + generatedNumber);
			
			if (generatedNumber >= 40 && generatedNumber <= 60) {
				System.out.println("Herzlichen Glückwunsch! Sie haben gewonnen!");
			}
			
			else {
				System.out.println("Leider verloren.");
			}
		}
		
		scanner.close();

	}

}
