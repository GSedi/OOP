package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.println("Enter student's name..");
        String name = str.nextLine();

        System.out.println("Enter student's ID..");
        String id = str.nextLine();

        Scanner num = new Scanner(System.in);
        System.out.println("Enter student's year of study..");
        int year = num.nextInt();

        Student s = new Student(name, id, year);

        s.incrementYear();
        System.out.println("Name: " + s.getName() + "\n" + "ID:   " + s.getID() + "\n" + "Year: " + s.getYear());

    }
}
