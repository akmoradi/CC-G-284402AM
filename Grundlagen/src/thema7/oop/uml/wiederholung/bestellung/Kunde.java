package thema7.oop.uml.wiederholung.bestellung;

public class Kunde extends Person {

	public Kunde(int id, String name) {
		this.setId(id);
		this.setName(name);
	}
	
	@Override
	public int getId() {
		
		return 77345 + this.getId();
	}

	@Override
	public String getPlz() {
		
		return "KDP: " + this.getPlz();
	}

	@Override
	public String getAdresse() {
		return "KDA: " + this.getAdresse();
	}

}
