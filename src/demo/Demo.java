/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("What is your name?"); 
        
        Scanner objScanner = new Scanner(System.in);
        String stringName = objScanner.nextLine();
        
        System.out.println("Your name is " + stringName);
        
        System.out.println("Enter your age:");
        int intAge = objScanner.nextInt();
        
        System.out.println("Your age is " + intAge);
        
        System.out.println("Enter your height(feet):");
        int intHeightFeet = objScanner.nextInt();
        
        System.out.println("Enter your height(inches):");
        int intHeightInches = objScanner.nextInt();
        
        System.out.println("Your height is " + intHeightFeet + " feet and " + intHeightInches + " inches.");
    
        int intWeight = ((intHeightFeet * 12) + intHeightInches) * 2;
        
        System.out.println("Your ideal wright is " + intWeight + " pounds");
        
        if(intWeight <= 70)
        {
            System.out.println("You are UnderWeight.");
        }
        else if(intWeight > 70 && intWeight < 120)
        {
            System.out.println("You are NormalWeight.");
        }
        else
        {
            System.out.println("You are OverWeight.");
        }
    }
}
