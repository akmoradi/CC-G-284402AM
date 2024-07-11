package exercises;

public class DatenTypKonversionInJava {

	public static void main(String[] args) {
        byte b1 = 10, b2 = 20;
        short p = 200;
        int n = 500;
        long q = 100;
        float x = 2.5f;
        double y = 5.25;

        System.out.println("b1 + b2: " + ((Object)(b1 + b2)).getClass().getName());
        System.out.println("p + b1: " + ((Object)(p + b1)).getClass().getName());
        System.out.println("b1 * b2: " + ((Object)(b1 * b2)).getClass().getName());
        System.out.println("q + p * (b1 + b2): " + ((Object)(q + p * (b1 + b2))).getClass().getName());
        System.out.println("x + q * n: " + ((Object)(x + q * n)).getClass().getName());
        System.out.println("b1 * q / x: " + ((Object)(b1 * q / x)).getClass().getName());
        System.out.println("b1 * q * 2. / x: " + ((Object)(b1 * q * 2. / x)).getClass().getName());
        System.out.println("b1 * q * 2.f / x: " + ((Object)(b1 * q * 2.f / x)).getClass().getName());
    }
		

}
