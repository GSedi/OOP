package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner str = new Scanner(System.in);
    	Data dat = new Data();
    	String s = str.next();
    	if(s.equals("Q")) {
    		System.out.println("Average = 0.0");
    		System.out.println("Maximum = 0.0");
    		return;
    	}
    	dat.setData(Double.parseDouble(s));
    	while(!(s.equals("Q"))) {

    		dat.maxData(Double.parseDouble(s));
    		dat.cnt(Double.parseDouble(s));
			s = str.next();
    	}
    	
    	
    	System.out.println("Maximum = " + dat.setData());
    	System.out.println("Average = " + dat.avgData());
    }
}
