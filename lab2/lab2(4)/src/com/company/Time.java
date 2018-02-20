package com.company;

public class Time {
    public int hour;
    public int minute;
    public int second;


    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void toUniversal(){
        System.out.println("Universal: " + this.hour + ":" + this.minute + ":" + this.second);
    }

    public void toStandard(){
        if(this.hour >= 12){

            if(this.hour == 12){
                System.out.println("Standart: 12:"+ this.minute + ":" + this.second + "PM");
            }
            int a = this.hour - 12;
            System.out.println("Standart: " + a + ":" + this.minute + ":" + this.second + "PM");
        }
        else{
            System.out.println("Standart: " + this.hour + ":" + this.minute + ":" + this.second + "AM");
        }
    }
}
