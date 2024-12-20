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
class MatrixMultiplication {
    public static void main(String args[]){
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		int c[][] = new int[5][5];
                int s[][] = new int[5][5];
		int m,n,p,q;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimentions of the array a:");
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.println("Enter the dimentions of the array b:");
		p = sc.nextInt();
		q = sc.nextInt();
		if(n==p){
			System.out.println("Enter the elements of the array a:\n");
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the elements of the array b:\n");
			for(int i=0;i<p;i++){
				for(int j=0;j<q;j++){
					b[i][j] = sc.nextInt();
				}
			}
                        
                        //MULTIPLICATION
			for(int i=0;i<m;i++){
				for(int j=0;j<q;j++){
					c[i][j] = 0;
					for(int k=0;k<n;k++){
						c[i][j] = c[i][j] + a[i][k]*b[k][j];
					}
				}
			}
                        
                        //ADDITION
                        for(int i=0;i<m;i++){
				for(int j=0;j<q;j++){
                                    s[i][j] = a[i][j]+b[i][j];
                                }
                        }
                        
			System.out.println("The product matrix is:\n");
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
                        
                        System.out.println("The sum matrix is:\n");
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					System.out.print(s[i][j] + " ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Enter valid dimensions!!");
	}
}
