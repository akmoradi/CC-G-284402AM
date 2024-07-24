package thema7.oop.uml.wiederholung.bestellung;

public abstract class Person implements Identifizierbar {

	private int id;
	
	private String name;
	
	private String emailAdresse;
	
	private String adresse;
	
	private String plz;
	
	public String gibAdresseUndPlz() {
		return adresse + " - " + plz;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailAdresse() {
		return emailAdresse;
	}
	
	public void setEmailAdresse(String emailAdresse) {
		this.emailAdresse = emailAdresse;
	}
	
	@Override
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", plz=" + plz + "]";
	}
	
	
}
