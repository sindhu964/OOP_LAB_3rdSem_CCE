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
public class MagicSquare {
    public static void main(String args[]){
		int a[][] = new int[5][5];
		int rsum[] = new int[10];
		int csum[] = new int[10];
		int i,j,m,n,trace,mag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimentions of the array:");
		m = sc.nextInt();
		n = sc.nextInt();
		if(m==n){
			System.out.println("Enter the elements of the array:\n");
			for(i=0;i<m;i++){
				for(j=0;j<n;j++){
					a[i][j] = sc.nextInt();
				}
			}


			//ROW SUM
    			for(i=0;i<m;i++){
        			rsum[i]=0;
       			 	for(j=0;j<n;j++)
            			rsum[i]=rsum[i]+a[i][j];
    			}
    			System.out.println();


    			//COLUMN SUM
    			for(j=0;j<n;j++){
       				csum[j]=0;
        			for(i=0;i<m;i++)
            				csum[j]=csum[j]+a[i][j];
    			}


    			//TRACE
    			trace=0;
    			for(i=0;i<m;i++)
       				for(j=0;j<n;j++)
        				if(i==j){
        					trace=trace+a[i][j];
       					}

    			//CHECK MAGIC SQUARE
    			mag=0;
   			for(j=0;j<n;j++)
   				if(rsum[j]==rsum[j+1]){
        				for(i=0;i<m;i++)
        					if(csum[i]==csum[i+1]){
            						if(rsum[j]==csum[i])
                						if(trace==rsum[j])
                    							mag=1;
       				}
    			}
   			System.out.println();
    			if(mag==1)
     				System.out.println("Magic Square");
    			else
        			System.out.println("Not magic square");

			
		}
		else
			System.out.println("Enter a square matrix!!");
	}
}
