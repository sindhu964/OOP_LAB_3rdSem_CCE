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
public class Occurances {
    public static void main(String args[]){
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int i,n,key,occ=0;
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the search element:");
        key = sc.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==key){
                occ++;
                System.out.println("Found at position " + (i+1));
            }
        }
        System.out.println("Number of occuarances of " + key + " are = " + occ);
    }
}
