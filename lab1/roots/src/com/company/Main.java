package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);
        System.out.println("Enter coefficients a, b and c ...");
	    double a, b, c;
	    a = num.nextDouble();
        b = num.nextDouble();
        c = num.nextDouble();

        double D;
        D = b*b - 4*a*c;

        double x1, x2;
        if(a == 0){
            System.out.println("Equation is not quadratic.");
            return;
        }
        if(D < 0){
            System.out.println("ERROR, The D is negative ");
        }else if(D == 0){
            x1 = (-1*b)/(2*a);
            System.out.println("Equation have one root, the answer is ...");
            System.out.println(x1);
        }
        else {
            x1 = (-1 * b + Math.sqrt(D)) / (2 * a);
            x2 = (-1 * b - Math.sqrt(D)) / (2 * a);
            System.out.println("Equation have two roots, the answer is ...");
            System.out.println(x1 + " " + x2);
        }
    }
}
