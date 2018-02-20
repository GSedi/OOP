package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner num = new Scanner(System.in);
        System.out.println("Enter a square side length...");
	    double a = num.nextDouble();

	    System.out.println("Area of the square with a side " + a + " = " + a*a);
        System.out.println("Perimeter of the square with a side " + a + " = " + 4*a);
        System.out.println("Length of diagonal of the square with a side " + a + " = " + a*Math.sqrt(2.0));
    }
}
