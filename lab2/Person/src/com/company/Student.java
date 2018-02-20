package com.company;

public class Student {
    private String name;
    private String id;
    private int year;


    Student(String name, String id, int year){
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void incrementYear(){
        this.year++;

    }

    public String getName(){
        return this.name;
    }
    public String getID(){
        return this.id;
    }
    public int getYear(){
        return this.year;
    }


}
