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
public class TraceNorm {
    public static void main(String args[]){
        double a[][] = new double[10][10];
        double norm,trace=0,sum=0;
        int m,n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array:");
        m = sc.nextInt();
        n = sc.nextInt();
        if(m==n){
            System.out.println("Enter the elements of the array:");
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    a[i][j] = sc.nextDouble();
                }
            }
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    if(i==j){
                        trace = trace + a[i][j];
                    }
                    sum = sum + a[i][j]*a[i][j];
                }
            }
            norm = Math.sqrt(sum);
            //System.out.println("Sum = " + sum);
            System.out.println("Trace = " + trace);
            System.out.println("Norm = " + norm);
        }
    }
}
