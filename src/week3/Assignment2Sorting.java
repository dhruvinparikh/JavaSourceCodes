/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class Assignment2Sorting {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int intNum1 = scanner.nextInt();
        //scanner.nextLine();
        int intNum2 = scanner.nextInt();
        //scanner.nextLine();
        int intNum3 = scanner.nextInt();
        //scanner.nextLine();
        
        System.out.println("Num1: " + intNum1 + " Num2: " + intNum2 + " Num3: " + intNum3);
        
        if(intNum3 < intNum2 && intNum3 < intNum1)
        {
                System.out.println("1. " + intNum3);
                
                if(intNum2 < intNum1)
                {
                    System.out.println("2 ." + intNum2);
                    System.out.println("3. " + intNum1);
                }
                else
                {
                    System.out.println("2. " + intNum1);
                    System.out.println("3. " + intNum2);
                }
        }
        else if(intNum2 < intNum3 && intNum2 < intNum1)
        {
                System.out.println("1. " + intNum2);
                
                if(intNum3 < intNum1)
                {
                    System.out.println("2 ." + intNum3);
                    System.out.println("3. " + intNum1);
                }
                else
                {
                    System.out.println("2. " + intNum1);
                    System.out.println("3. " + intNum3);
                }
        }
        else if(intNum1 < intNum2 && intNum1 < intNum3)
        {
                System.out.println("1. " + intNum1);
                
                if(intNum2 < intNum3)
                {
                    System.out.println("2 ." + intNum2);
                    System.out.println("3. " + intNum3);
                }
                else
                {
                    System.out.println("2. " + intNum3);
                    System.out.println("3. " + intNum2);
                }
        }
    }
    
}
