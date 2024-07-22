package thema5.arrays.examples;

import java.util.Random;

/**
 * Klasseneigenschaften: static (atttribute, methoden)
 * 
 * Objekteigenschaften
 */
public class WarmUp {

	public static void main(String[] args) {

		int laenge = 200;
		
		// Deklaration
		int [] alterList = new int[laenge];
		
		// Zuweisung - Informationspeicherung
		listeBefuellen(alterList);
		
		// Ausgabe
		listeAusgeben(alterList);
	}

	public static void listeBefuellen(int[] liste) {
		Random random = new Random();
		for(int i = 0; i < liste.length; i++) {
			liste[i] = random.nextInt(100);
		}
	}
	
	public static void listeAusgeben(int[] liste) {
		for(int i=0; i<liste.length; i++) {
			System.out.println(i + ": " + liste[i]); 
		}
	}
}
