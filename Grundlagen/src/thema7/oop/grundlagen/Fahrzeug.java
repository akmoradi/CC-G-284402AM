package thema7.oop.grundlagen;

import java.util.Random;

public class Fahrzeug {

	protected int id;
	
	private String marke;
	
	private String modell;
	
	private int baujahr;
	
	private Abmessung abmessung;
	
	public Fahrzeug() {
		this.id = generiereFahrzeugId();		
	}
	
	public Fahrzeug(int id, String marke, String modell, int baujahr, Abmessung abmessung) {
		this();
		
		this.id = id;
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
		this.abmessung = abmessung;
	}

	protected int generiereFahrzeugId() {
		Random random = new Random();
		int zahl = random.nextInt(100, 2000);
		return zahl;
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
	
	
	public Abmessung getAbmessung() {
		return abmessung;
	}
	
	
	public void setAbmessung(Abmessung abmessung) {
		this.abmessung = abmessung;
	}

	@Override
	public String toString() {
		return "Fahrzeug [id=" + id + ", marke=" + marke + ", modell=" + modell + ", baujahr=" + baujahr + "]";
	}
		
}
