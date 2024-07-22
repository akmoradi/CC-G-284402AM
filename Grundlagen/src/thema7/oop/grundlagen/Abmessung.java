package thema7.oop.grundlagen;

public class Abmessung {

	private double laenge;
	
	private double breite;
	
	private double hoehe;
	
	private double radstand;
	
	private double leergewicht;
	
	private double zulaessigesGesamtgewicht;
	
	private double kofferraumvolumen;
	
	
	public Abmessung(double laenge, double breite, double hoehe, double leergewicht) {
		super();
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
		this.leergewicht = leergewicht;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	public double getRadstand() {
		return radstand;
	}

	public void setRadstand(double radstand) {
		this.radstand = radstand;
	}

	public double getLeergewicht() {
		return leergewicht;
	}

	public void setLeergewicht(double leergewicht) {
		this.leergewicht = leergewicht;
	}

	public double getZulaessigesGesamtgewicht() {
		return zulaessigesGesamtgewicht;
	}

	public void setZulaessigesGesamtgewicht(double zulaessigesGesamtgewicht) {
		this.zulaessigesGesamtgewicht = zulaessigesGesamtgewicht;
	}

	public double getKofferraumvolumen() {
		return kofferraumvolumen;
	}

	public void setKofferraumvolumen(double kofferraumvolumen) {
		this.kofferraumvolumen = kofferraumvolumen;
	}
}
