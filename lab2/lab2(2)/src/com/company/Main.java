package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	System.out.println("Enter triangle's width..");
    int width = num.nextInt();
    StarTriangle small = new StarTriangle(width);

        System.out.println(small);
    }
}
