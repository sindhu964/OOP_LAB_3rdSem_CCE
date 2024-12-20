/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author student
 */

import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        int n,m,count,i,j;
        count = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter n:");
        n = sc.nextInt();
        System.out.println("Enter m:");
        m = sc.nextInt();
        System.out.println("The prime numbers between" + n + "and" + m + "are:");
        for(i=n;i<=m;i++){
            count=0;
            for(j=2;j<i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
             if(count==0 && i!=1)
              System.out.println(i);
        }
        
    }
}
