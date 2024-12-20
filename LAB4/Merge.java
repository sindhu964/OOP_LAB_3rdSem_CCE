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
public class Merge {
    public static void main(String args[]){
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[30];
        int n,m,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in a:");
        m = sc.nextInt();
        System.out.println("Enter the number of elements in b:");
        n = sc.nextInt();
        System.out.println("Enter the elements of a:");
        for(i=0;i<m;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of b:");
        for(i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        for(i=0;i<m;i++){
            c[i] = a[i];
        }
        for(i=m;i<m+n;i++){
            c[i] = b[i];
        }
        System.out.println("Array after merging:");
        for(i=0;i<n+m;i++){
            System.out.println(c[i]);
        }
    }
}
