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
public class Symmetric {
    public static void main(String args[]){
		int arr[][] = new int[5][5];
		int m,n,flag=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimentions of the array:");
		m = sc.nextInt();
		n = sc.nextInt();
		if(m==n){
			System.out.println("Enter the elements of the array:\n");
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					arr[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if(arr[i][j]!=arr[j][i]){
						flag = 0;
					}
				}
			}
			if(flag==1){
				System.out.println("Symmetric Matrix!!");
			}
			else{
				System.out.println("Not Symmetric Matrix!!");
			}
		}
		else
			System.out.println("Enter a square matrix!!");
	}
}
