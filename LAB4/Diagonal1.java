/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Diagonal1 {
    public static void main(String args[]){
		int arr[][] = new int[5][5];
		int m,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimentions of the array:");
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.println("Enter the elements of the array:\n");
		for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					arr[i][j] = sc.nextInt();
				}
		}
		if(m==n){
			System.out.println("The diagonal elements are:");
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if(j==n-i-1){
						System.out.println(arr[i][j]);
						sum = sum + arr[i][j];
					}
				}
			}
			System.out.println("The sum of the diagonal elements are:" + sum);
		}
		else
			System.out.println("Enter a square matrix!!");
	}
}
