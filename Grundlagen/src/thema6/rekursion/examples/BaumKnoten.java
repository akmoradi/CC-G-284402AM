package thema6.rekursion.examples;

public class BaumKnoten {

	private int wert;
	
	private BaumKnoten links, rechts;
	
	public BaumKnoten(int wert) {
		this.wert = wert;
		links = rechts = null;
	}
	
	public BaumKnoten getLinks() {
		return links;
	}
	
	public void setLinks(BaumKnoten links) {
		this.links = links;
	}
	
	public BaumKnoten getRechts() {
		return rechts;
	}
	
	public void setRechts(BaumKnoten rechts) {
		this.rechts = rechts;
	}
	
}
