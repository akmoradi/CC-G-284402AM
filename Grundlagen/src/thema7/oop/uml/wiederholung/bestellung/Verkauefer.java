package thema7.oop.uml.wiederholung.bestellung;

public class Verkauefer extends Person {

	@Override
	public int getId() {
		
		return 2345 + this.getId();
	}

	@Override
	public String getPlz() {
		
		return "VKP: " + this.getPlz();
	}

	@Override
	public String getAdresse() {
		return "VKA: " + this.getAdresse();
	}

}
