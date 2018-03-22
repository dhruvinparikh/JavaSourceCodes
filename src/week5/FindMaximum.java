/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *This program will get user input for numbers until user enters 0 and finds the maximum
 * number that user entered
 * @author imsil
 */
public class FindMaximum {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter th numbers ending with 0");
        int number = scanner.nextInt();
        int maxNumber = number;
        while(number != 0){
            number = scanner.nextInt();
            if(maxNumber < number)
                maxNumber = number;
        }
        System.out.println("Maximum number entered is: " + maxNumber);
    }
    
}
