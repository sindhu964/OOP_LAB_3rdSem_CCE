/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author student
 */

import java.util.Scanner;
public class LargestSmallest {
    public static void main(String args[]){
        int a[] = new int[10];
        int i,n,min,max=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements of the 1D array:");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        min = a[0];
        for(i=0;i<n;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
