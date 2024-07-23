package thema7.oop.grundlagen;

public class Motor {

	private double hubraum;
	
	private int leistung;
	
	private int drehmoment;
	
	private double beschleunigung;
	
	private int hoechstgeschwindigkeit;

	public Motor(double hubraum, int leistung, int drehmoment, double beschleunigung, int hoechstgeschwindigkeit) {
		super();
		this.hubraum = hubraum;
		this.leistung = leistung;
		this.drehmoment = drehmoment;
		this.beschleunigung = beschleunigung;
		this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
	}
	
	public double getHubraum() {
		return hubraum;
	}

	public void setHubraum(double hubraum) {
		this.hubraum = hubraum;
	}

	public int getLeistung() {
		return leistung;
	}

	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}

	public int getDrehmoment() {
		return drehmoment;
	}

	public void setDrehmoment(int drehmoment) {
		this.drehmoment = drehmoment;
	}

	public double getBeschleunigung() {
		return beschleunigung;
	}

	public void setBeschleunigung(double beschleunigung) {
		this.beschleunigung = beschleunigung;
	}

	public int getHoechstgeschwindigkeit() {
		return hoechstgeschwindigkeit;
	}

	public void setHoechstgeschwindigkeit(int hoechstgeschwindigkeit) {
		this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
	}

	
}
