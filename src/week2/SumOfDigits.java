/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author n01150847
 */
public class SumOfDigits {
    public static void main(String[] args){
        //Input
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Enter 3-digit number:");
        int number = objScanner.nextInt();
        
        //Process
        int digit1 = number/100;
        int digit2 = (number/10)%10;
        int digit3 = number%10;
        int sum = digit1 + digit2 + digit3;
        
        //Output
        System.out.println(number + ": " + digit1 + "-Hundreds, " + digit2 + "-Tens and " + digit3 + "-Ones.");
        System.out.println(digit1 +  "+" + digit2 + "+" + digit3 + " = " +  sum);
    }
    
}
