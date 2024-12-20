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
 class armstrong{
    public static void main(String args[]){
    int num,rem,temp,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        temp = num;
        while(num>0){
            rem = num%10;
            sum = sum + (rem*rem*rem);
            num = num/10;
        }
        //System.out.println("The sum is:" + sum);
        if(sum==temp){
            System.out.println("Armstrong Number");
        }
        else
            System.out.println("Not an Armstrong number:");
    }
}