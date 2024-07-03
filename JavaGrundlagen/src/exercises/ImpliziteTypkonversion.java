package exercises;

public class ImpliziteTypkonversion {

	public static void main(String[] args) {
		 
		byte b1 = 10; 
		byte b2 = 20; 
		short p = 200; 
		int n = 500; 
		long q = 100; 
		float x = 2.5f; 
		double y = 5.25;
		
		
		int a = b1 + b2;
		System.out.println("a = " + a);
		
		int b = p + b1;
		System.out.println("b = " + b);
		
		int c = b1 * b2;
		System.out.println("c = " + c);
		
		long d = q + p * (b1 + b2);
		System.out.println("d = " + d);
		
		float e = x + q * n;
		System.out.println("e = " + e);
		
		float f = b1 * q / x;
		System.out.println("f = " + f);
		
		double g = b1 * q * 2./x;
		System.out.println("g = " + g);
		
		float h = b1 * q * 2.f/x;
		System.out.println("h = " + h);
		
		

	}

}
