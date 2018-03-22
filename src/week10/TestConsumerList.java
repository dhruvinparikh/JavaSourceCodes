/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class TestConsumerList {
    public static void main(String[] args){
        Scanner objScanner = new Scanner(System.in);
        
        ConsumerList objConsumer = new ConsumerList();
        
        System.out.println("Press C for customised defaulter list generation,");
        System.out.println("any other key for system default list generation");
        char chrChoice = objScanner.next().charAt(0);
        objScanner.nextLine();
        
        if(chrChoice == 'C' || chrChoice == 'c'){
            System.out.println("Press A for getting list after enetered date, B to get the same whose due dates are before entered date:");
            chrChoice = objScanner.next().charAt(0);
            objScanner.nextLine();
            
        }
        
        objConsumer.generateDefaulterList(chrChoice);
    }
}
    
