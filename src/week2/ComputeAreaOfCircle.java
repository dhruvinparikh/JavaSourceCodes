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
public class ComputeAreaOfCircle {
    public static void main(String[] args){
        //Input from console
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double radius = objScanner.nextDouble();
        
        //method-1 to flush buffer
        objScanner = new Scanner(System.in);
        
        /*method-2 to flush buffer
        objScanner.nextLine();*/
       
        System.out.println("Enter name:");
        String str = objScanner.nextLine();
        System.out.println(str);
        
        final double num = 22;
        final double den = 7;
        final double PI = num/den;
      
        //Process
        double area = PI * radius * radius;
        
        //output
        System.out.println("Area of circle with radius " + radius + " is " + (int)(area*100)/100.0);
        System.out.printf("%.2f\n",area);
    }
    
}
