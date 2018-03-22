/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.util.Scanner;

/**
 *
 * @author imsil
 * 2.	Write a method that checks whether a string is a valid password. 
 * Suppose the password rules are as follows:
a.	A password must have atleast 8 characters
b.	A password must contain only letters and digits
c.	A password must contain at least two digits

 */
public class PasswordCheck {
   public static void main(String args[]){
       
       Scanner objScanner = new Scanner(System.in);
       System.out.println("Enter password:");
       String strPassword = objScanner.nextLine();
       
       switch(validatePassword(strPassword)){
           case 1:
               System.out.println("Password is valid!");
               break;
           case 2:
               System.out.println("Password must have atleast 2 digits!");
               break;
           case 3:
               System.out.println("Password can only be Alphanumeric!");
               break;
           case 4:
               System.out.println("Password must be atleast 8 characters long!");
               break;
       }
       
   } 
   public static int validatePassword(String strPassword){
       boolean checkLetterDigit = true;
       int validPass = 0;
       int countDigit = 0;
       if(strPassword.length() >= 8 ){
           for(int i = 0 ; i < strPassword.length() ; i++){
               if(Character.isLetterOrDigit((strPassword.charAt(i)))){
                   continue;
               }
               else{
                   checkLetterDigit = false;
                   break;
               }
           }
           if(checkLetterDigit){
               for(int i = 0 ; i < strPassword.length() ; i++){
                   if(Character.isDigit(strPassword.charAt(i))){
                       countDigit++;
                   }
               }
               if(countDigit >= 2){
                   validPass = 1;
               }
               else{
               validPass = 2;
           }
           }
           else{
               validPass = 3;
           }
       }
       else{
           validPass = 4;
       }
       return validPass;
   }
}
