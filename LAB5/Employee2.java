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
public class Employee2 {
    public static void main(String args[]){
        String name, place;
        float sal,da,rent,totl;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the employee: ");
        name = sc.nextLine();
        System.out.println("Enter city of the employee: ");
        place = sc.nextLine();
        System.out.println("Enter the salary of the employee: ");
        sal = sc.nextFloat();
        System.out.println("Enter dearness allowance of the employee: ");
        da = sc.nextFloat();
        System.out.println("Enter house rent of the employee: ");
        rent = sc.nextFloat();
        Employee obj = new Employee();
        //obj.getdata("xxx", "abcd", 50000, 15, 10000);
        obj.getdata(name,place,sal,da,rent);
        totl = obj.calculate();
        obj.display(totl);
    }
}

class Employee{
    String emp_name;
    String city;
    float salary;
    float DA;
    float HRA;
    
    void getdata(String name, String place, float sal, float da, float rent){
        emp_name = name;
        city = place;
        salary = sal;
        DA = da;
        HRA = rent;
    }
    
    float calculate(){
        float Total;
        Total = salary + salary * DA / 100 + salary * HRA / 100;
        return Total;
    }
    
    void display(float total){
        System.out.println("Total : " + total);
    }
}