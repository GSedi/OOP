package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);
	    System.out.println("Enter hh:mm:ss...");

	    int hour = num.nextInt();
        int minute = num.nextInt();
        int second = num.nextInt();

        Time t = new Time(hour, minute, second);

        t.toUniversal();
        t.toStandard();
    }
}
