package thema7.oop.grundlagen;

public class Auto extends Fahrzeug {

	private Motor motor;
	
	public Auto() {
	}
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		
		return super.toString() + ", motor=" + motor;
	}

	@Override
	protected int generiereFahrzeugId() {
		
		int id = super.generiereFahrzeugId();
		
		if(id == 100) {
			id = 99;
		}
		
		return id;
	}
	
}
