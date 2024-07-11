package almo.myjavaexercises.io;

import java.util.Scanner;

public class Eingaben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eingabe: ");
        
        // Reading different types of inputs
        String st = sc.next();
        System.out.println("String: " + st);
        
        byte b = sc.nextByte();
        System.out.println("Byte: " + b);
        
        short s = sc.nextShort();
        System.out.println("Short: " + s);
        
        int i = sc.nextInt();
        System.out.println("Int: " + i);
        
        long l = sc.nextLong();
        System.out.println("Long: " + l);
        
        float f = sc.nextFloat();
        System.out.println("Float: " + f);
        
        double d = sc.nextDouble();
        System.out.println("Double: " + d);
        
        boolean bl = sc.nextBoolean();
        System.out.println("Boolean: " + bl);
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}

