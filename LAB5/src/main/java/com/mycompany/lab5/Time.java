/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author student
 */

import java.util.Scanner;
public class Time {
    public static void main(String args[]){
        int hour1, hour2, minute1, minute2, second1, second2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time1:");
        hour1 = sc.nextInt();
        minute1 = sc.nextInt();
        second1 = sc.nextInt();
        System.out.println("Enter time2:");
        hour2 = sc.nextInt();
        minute2 = sc.nextInt();
        second2 = sc.nextInt();
        Time1 obj = new Time1();
        Time1 obj1 = new Time1(hour1,minute1,second1);
        Time1 obj2 = new Time1(hour2,minute2,second2);
        obj.sum(obj1,obj2);
        obj.display();
    }
}

class Time1{
    int hours;
    int minutes;
    int seconds;
    
    Time1(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    
    Time1(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }
    
    void sum(Time1 obj1,Time1 obj2){
        int ref_seconds = (obj1.hours+obj2.hours)*3600 + (obj1.minutes+obj2.minutes)*60 + (obj1.seconds+obj2.seconds);
        hours = ref_seconds/3600;
        ref_seconds = ref_seconds%3600;
        minutes = ref_seconds/60;
        seconds = ref_seconds%60;
    }
    
    void display(){
        System.out.println("Sum of time: ");
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
