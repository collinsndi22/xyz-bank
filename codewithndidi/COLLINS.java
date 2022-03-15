/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codewithndidi;

import java.util.Scanner;

/**
 *
 * @author FLORENCE
 */
public class COLLINS {
    public static void main(String[] args){
        System.out.println("WELCOME TO XYZ BANK.");
    System.out.println("SELECT AN ACCOUNT FROM BELOW ACCOUNTS;");
    System.out.println("1. REGULAR ACCOUNT.");
    System.out.println("2. INTEREST ACCOUNT.");
    System.out.println("3. CHECKING ACCOUNT.");
    System.out.println("4. CD ACCOUNT.");
    System.out.println("PINs ARE: 1   2   3   4");
    Scanner scn= new Scanner(System.in);
    System.out.println("ENTER THE PIN");
    int PIN= scn.nextInt();
    if(PIN==1){
        System.out.println("REGULAR ACCOUNT");
        System.out.println("CHARGES ARE:10% of the balance at the end of the month");
        System.out.println("INTEREST: ZERO");
        System.out.println("PENALITIES ARE:10.00 when the balance goes below the minimum of 50000.00");
    }
    else if(PIN==2){
        System.out.println("INTEREST ACCOUNT");
        System.out.println("CHARGES ARE:10% of the balance at the end of the month");
        System.out.println("INTEREST:7% paid monthly");
        System.out.println("NO MINIMUM BALANCE NEEDED");
}
    else if(PIN==3){
        System.out.println("CHECKING ACCOUNT");
        System.out.println("CHARGES ARE:10% of the balance at the end of the month,  0.10 for each transaction");
        System.out.println("INTERESTS ARE:Anually 7% paid per month");
        System.out.println("PENALITIES ARE:10.00 if the balance goes below minimum balance 10,000.00");
        
}
    else if(PIN==4){
         System.out.println("CD ACCOUNT.");
         System.out.println("CHARGES ARE:10% of the balance at the end of the month");
         System.out.println("CHARGES ARE:10% of the balance at the end of the month");
         System.out.println("PENALITIES ARE:20% of the balance when withdra is made before 12 months from oppening of the account");
         
    }
    else{
        System.out.println("WRONG PIN TRY AGAIN");
        main(null);
    }
}    
}

Thank you recieved

        
    

