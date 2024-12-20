/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author student
 */
public class Box {
    public static void main(String args[]){
        Box1 obj;
        obj = new Box1(2.0,5.0,2.0);
        System.out.println("Volume: " + obj.volume());
    }
}

class Box1{
    double width;
    double height;
    double depth;
    
    Box1(){
    }
    
    Box1(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    double volume(){
        return width*height*depth;
    }
}