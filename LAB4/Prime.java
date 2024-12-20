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
public class Prime {
    public static void main(String args[]){
        int a[] = new int[10];
        int n,i,j;
        boolean isPrime;
        //isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The prime numbers are:");
        for(i=0;i<n;i++){
            isPrime = true;
              for(j=2;j<a[i];j++){
                if(a[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true && a[i]!=1 && a[i]!=0){
                System.out.println(a[i]);
            }
        }
        
    }
}
