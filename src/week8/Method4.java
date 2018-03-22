/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author n01150847
 * Write a tip calculator that allows a restaurant or bar customer to calculate 
 * the amount of a tip to give their wait person. The program should allow the 
 * customer to specify the bill amount and the percentage of tip they would like 
 * to give.
The program should include the following methods:
•	getDoubleInput()
Inputs: a prompt to display to the user, asking for a numeric value
Returns: a double value that was entered by the user
This method displays prompt to the user on the console, then uses a Scanner object 
* to retrieve a double value from the user. The method then returns the value entered. 
* You can add some validation to this method if you wish.
•	calcTip()
Inputs: a bill amount, a tip percentage
Returns: a tip amount in dollars
This method calculates a dollar amount to tip a wait person by multiplying the 
* bill amount by the tip percentage (as a decimal).
•	displayAmt()
Inputs: a dollar amount to display
Returns: nothing
This method receives a dollar amount and displays it formatted with a dollar 
* sign and exactly two decimal places on the console

 */
public class Method4 {
    public static void main(String[] args){
        displayAmt();
    }
    
    public static double getDoubleInput(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the amount:");
        double dblAmt = scanner.nextDouble();
        
        return dblAmt;   
    }
    
    public static double calcTip(){
        double dblAmt = getDoubleInput();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter tip %:");
        double tipPer = scanner.nextDouble();
        
        return ((tipPer*dblAmt)/100);
        
        
    }
    
    public static void displayAmt(){
        
        System.out.printf("\nAmount: $%2.2f\n",calcTip());
    }
}
