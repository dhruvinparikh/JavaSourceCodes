/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;

/**
 *
 * @author imsil
 * Write a program that passes a string and a character as input and displays 
 * the number of occurrences of the character in the string.
 */
public class MTR6 {
    public static void main(String[] args){
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("Enter a character");
        char chrChar = objScanner.next().charAt(0);
        
        int count = 0;
        
        objScanner.nextLine();
        
        System.out.println("Enter a string");
        String strString = objScanner.nextLine();
        
        for(int i = 0 ; i < strString.length() ; i++){
            if(strString.charAt(i) == chrChar){
                count++;
            }
        }
        
        System.out.println("# occurrences of " + chrChar + " is: " + count);
    }
}
