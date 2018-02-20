package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your initial balance...");
        double n = num.nextInt();
        System.out.println("Enter interest(%)...");
        double pr = num.nextInt();

        double sum = n + (pr*n)/100;
        System.out.println("Your new balance is equal to " + sum );
    }
}
