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
public class Overloading {
    public static void main(String args[]){
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        r = sc.nextInt();
        Complex obj = new Complex();
        Complex obj1  = new Complex(4,5);
        Complex obj2  = new Complex(8,9);
        obj.Sum(obj1, obj2);
        System.out.println("Sum: ");
        System.out.print(obj.real);
        System.out.println("+" + obj.imaginary + "i");
        obj.Sum(r, obj1);
        System.out.println("Sum: ");
        System.out.print(obj.real);
        System.out.println("+" + obj.imaginary + "i");
    }
}

class Complex{
    int real;
    int imaginary;
    
    Complex(){
    }
    
    Complex(int a, int b){
        real = a;
        imaginary = b;
    }
    
    void Sum(int r, Complex obj1){
        real = r + obj1.real;
        imaginary = obj1.imaginary;
    }
    
    void Sum(Complex obj1, Complex obj2){
        real = obj1.real + obj2.real;
        imaginary = obj1.imaginary + obj2.imaginary;
    }
    
}
