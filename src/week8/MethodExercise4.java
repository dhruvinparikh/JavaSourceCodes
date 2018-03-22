/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author n01150847
 */
public class MethodExercise4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        displayName();
        System.out.println("Enter your birth year:");
        int intAge = scanner.nextInt();
        
        guessAge(intAge);
        
        System.out.println("Good Bye!");
    }
    
    public static void displayName(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String strName = scanner.nextLine();
        
        System.out.println("Hello " + strName + "!");
        
        
    }
    
    public static void guessAge(int intAge){
        Calendar now = Calendar.getInstance();   // Gets the current date and time
        int year = now.get(Calendar.YEAR); 
        
        System.out.println("Yout age is " + (year - intAge) + " year/s");
    }
}
