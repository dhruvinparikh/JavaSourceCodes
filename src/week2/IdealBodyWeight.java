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
public class IdealBodyWeight {
    public static void main(String[] args){
        //Input
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Enter \"feet\" portion of your height:");
        int height_feet = objScanner.nextInt();
        
        //objScanner = new Scanner(System.in);
        System.out.print("Enter \"Inches\" portion of your height:");
        int height_inches = objScanner.nextInt();
        
        //process
        int weight = 110 + ((((height_feet * 12)-60) + height_inches) * 5);
        
        //output
        System.out.println("Ideal body weight:" + weight + " pounds");
        
    }
    
}
