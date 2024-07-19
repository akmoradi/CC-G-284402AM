package thema7.oop.grundlagen;

public class Auto {

	private int id;
	
	private String marke;
	
	private String modell;
	
	private int baujahr;
	
	private Motor motor;
	
	private Abmessung abmessung;
	
	
	public Auto(int id, String marke, String modell, int baujahr) {
		this.id = id;
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getMarke() { // getter
		return marke;
	}

	public void setMarke(String marke) { // setter
		this.marke = marke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
//	
//	@Override
//	public String toString() {
//		return this.id + ", "+ this.marke + ", " + this.modell + ", " + this.baujahr;
//	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Abmessung getAbmessung() {
		return abmessung;
	}
	
	
	public void setAbmessung(Abmessung abmessung) {
		this.abmessung = abmessung;
	}
	
}
