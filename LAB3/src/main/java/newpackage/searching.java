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
public class searching {
    public static void main(String args[]){
        int a[] ={1,2,3,1,2,1,5,7};
        int search;
        //found=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched:");
        search = sc.nextInt();
        System.out.print("The value is found at locations: ");
        int i=0;
        for(int number : a){
            if(number==search){
                System.out.print("a[" + i + "], ");
            }
            i++;
        }
        
    } 
}
