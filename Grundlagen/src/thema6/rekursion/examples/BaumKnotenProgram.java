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
		wurzel.getLinks().setLinks(new BaumKnoten(4));
		wurzel.getLinks().setRechts(new BaumKnoten(5));
		wurzel.getRechts().setLinks(new BaumKnoten(6));
		wurzel.getRechts().setRechts(new BaumKnoten(7));
		
		int baumHoehe = berechneBaumHoehe(wurzel) - 1;
		System.out.println("Die Höhe des Baums ist: " + baumHoehe);
		
		
	}
	
	
	public static int berechneBaumHoehe(BaumKnoten knoten) {
		
		if(knoten == null) {
			return 0;
		}
		
		int linkeHoehe = berechneBaumHoehe(knoten.getLinks());
		int rechteHoehe = berechneBaumHoehe(knoten.getRechts());
		
		return Math.max(linkeHoehe, rechteHoehe) + 1;
	}
}
