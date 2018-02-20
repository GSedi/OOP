package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);

	    System.out.println("Enter your score...");
	    double grade = num.nextDouble();
        System.out.println("Your grade is...");
	    if(grade >= 94.5){
	        System.out.println("A");
        }
        if(grade >= 89.5 && grade < 94.5){
            System.out.println("A-");
        }
        if(grade >= 84.5 && grade < 89.5){
            System.out.println("B+");
        }
        if(grade >= 79.5 && grade < 84.5){
            System.out.println("B");
        }
        if(grade >= 74.5 && grade < 79.5){
            System.out.println("B-");
        }
        if(grade >= 69.5 && grade < 74.5){
            System.out.println("C+");
        }
        if(grade >= 64.5 && grade < 69.5){
            System.out.println("C");
        }
        if(grade >= 59.5 && grade < 64.5){
            System.out.println("C-");
        }
        if(grade >= 54.5 && grade < 59.5){
            System.out.println("D+");
        }
        if(grade >= 49.5 && grade < 54.5){
            System.out.println("D");
        }
        if(grade < 49.5 ){
            System.out.println("Fail");
        }
    }
}
