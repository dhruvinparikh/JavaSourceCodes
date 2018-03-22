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
 * Write a program that counts the number of lowercase letters in a string. 
 * Your program should prompt the user to enter the string and display the count.
 */
public class MTR5 {
    public static void main(String[] args){
        Scanner objScanner = new Scanner(System.in);        
        
        System.out.println("Enter a string");
        String strString = objScanner.nextLine();
       
        int count = 0;
        
        for(int i = 0 ; i < strString.length() ; i++){
            if(Character.isLowerCase(strString.charAt(i))){
                count++;
            }
        }
            
            System.out.println("# of lower case letters: "+count);
        
    }
    
}
