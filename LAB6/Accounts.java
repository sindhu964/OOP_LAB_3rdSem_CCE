/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;


/**
 *
 * @author student
 */

import java.util.Scanner;

class Account1{
    String name;
    int acc_no;
    String acc_type;
    public static double balance;
    
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter account number:");
        acc_no = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter type of account (current/savings):");
        acc_type = sc.nextLine();
        System.out.println("Enter balance:");
        balance = sc.nextFloat();
    }
    
    void deposit(double dep){
        balance = balance + dep;
    }
    
    void display_bal(){
        System.out.println("Balance : " + balance);
    }
}

class Current extends Account1{
    void min_balance(){
        if(balance<500.0){
            System.out.println("Service tax of 5% imposed!!");
            balance=balance-((5.0/100.0)*balance);
            System.out.println("Balance: " + balance);
        }
    }
}

class Savings extends Account1{
    double rate = 10.0;
    double time = 3.0;
    void getInterest(){
    double CI = balance *Math.pow(1+rate/100.0,time) - balance;
            System.out.println("Compount Interest = " + CI);
    double SI = (balance*rate*time)/100.0;
        System.out.println("Simple Interest = " + SI);
    }
    
    void withdraw(double amount){
        if(amount<balance-500.0){
            System.out.println("Withdraw permitted!!");
            balance = balance - amount;
            //System.out.println("Balance:" + balance);
        }
        else
            System.out.println("Withdraw not permitted!");
    }
    
}
public class Accounts {
    public static void main(String args[]){
        char option;
        char choice;
        Account1 obj = new Account1();
        Savings s = new Savings();
        Current c = new Current();
        System.out.println("Enter bank details:");
        obj.getdata();
        do{
        System.out.println("a: Deposit");
        System.out.println("b: Display balance");
        System.out.println("c: Display interest");
        System.out.println("d: Withdrawal");
        System.out.println("e: Minimum balance");
        System.out.println("Choose an option");
        Scanner sc = new Scanner(System.in);
        option = sc.next().charAt(0);
        switch(option){
            case 'a':
                //deposit
                System.out.println("Enter the amount to be deposited:");
                double deposit = sc.nextDouble();
                obj.deposit(deposit);
                obj.display_bal();
                break;
            case 'b': 
                //display balance 
                obj.display_bal();
                break;
            case 'c': 
                s.getInterest();
                break;
            case 'd': 
                //withdraw
                System.out.println("Enter the amount to be withdrawn:");
                double amt = sc.nextDouble();
                s.withdraw(amt);
                obj.display_bal();
                break;
            case 'e': 
                //minimun balance
                c.min_balance();
                obj.display_bal();
                break;
        }
        System.out.println("Do you want to continue?(Y/N)");
        choice = sc.next().charAt(0);
    }while(choice=='Y' || choice=='y');
    } 
}

