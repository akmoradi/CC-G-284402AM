package thema6.rekursion.examples;

/**
 * 				  		1

 * 				2				3	
 * 	
 * 			4		5  		6		7
 */
public class BaumKnotenProgram {

	public static void main(String[] args) {

		BaumKnoten wurzel = new BaumKnoten(1);
		wurzel.setLinks(new BaumKnoten(2));
		wurzel.setRechts(new BaumKnoten(3));
	}
}
