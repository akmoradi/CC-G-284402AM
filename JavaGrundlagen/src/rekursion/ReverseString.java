package rekursion;

public class ReverseString {
    
	public static void main(String[] args) {
        String original = "Hallo";
        String umgekehrt = umkehrenString(original);
        System.out.println("Der umgekehrte String ist: " + umgekehrt);

    }
	
	public static String umkehrenString(String str) {
        // Base case
        if (str.isEmpty()) {
            System.out.print(str);
        	return str;
        }
       
        String temp = str.substring(1);
 	    System.out.println(temp + " " + str.charAt(0));
        // Recursive case
        return umkehrenString(str.substring(1)) + str.charAt(0);
    }

    
}