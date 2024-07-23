package thema7.oop.grundlagen;

public class ComputerSpielProgram {

	public static void main(String[] args) {

		// Deklaration
		Auto[] autos = new Auto[3];
		
		// Zuweisung
//		autos[0] = new Auto(1, "BMW", "X5", 2021);
//		autos[1] = new Auto(2, "Mercedes", "F5", 2023);
//		autos[2] = new Auto(3, "Audio", "Z5", 2024);
		

		Auto auto = new Auto();
		System.out.println(auto); 
		
		// Ausgabe
		// autosAusgeben(autos);
	}

	
	public static void autosAusgeben(Auto[] autos) {
		for(int i=0; i<autos.length; i++) {
			System.out.println( "Auto " + i + ": " + autos[i].getMarke() + " " + autos[i].getModell() + " " + autos[i].getBaujahr());  
		}
	}
}
