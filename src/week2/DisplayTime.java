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
public class DisplayTime {
    public static void main(String[] args){
        //Input
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Enter seconds:");
        int seconds = objScanner.nextInt();
        System.out.print("\n");
 
        //process
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int r_seconds = (seconds%3600)%60;
        

        
        //output
        System.out.println(seconds + " seconds is " + hours + " hour/s, " + minutes + " minute/s and " + r_seconds + " second/s.");
        
    }
    
}
