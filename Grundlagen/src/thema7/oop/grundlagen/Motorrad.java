package thema7.oop.grundlagen;

public class Motorrad extends Fahrzeug {

	private int hubraum;

	public Motorrad() {
	}

    public Motorrad(int hubraum) {
        this.hubraum = hubraum;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }
}
