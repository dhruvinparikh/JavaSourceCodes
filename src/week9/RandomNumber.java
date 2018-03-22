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
 * 6.	Write a method that returns a random number between 1 and 54, excluding 
 * the number passed in the argument. The method header is 
public static int getRandom(int… numbers)

 */
public class RandomNumber {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of elements(no more thsan 54)");
        int arraySize = scanner.nextInt();
        
        int[] intArray = new int[arraySize];
        
        System.out.println("Input " + arraySize + " elements: ");
        
        for(int i = 0 ; i < arraySize ; i++){
            intArray[i] = scanner.nextInt();
        }
        
        System.out.println("Random number : " + getRandom(intArray));
    }
    
    public static int getRandom(int... number){
        int rdmNum,i;
        i=0;
        int count=0;
        while(true){
            rdmNum = (int)(Math.random() * 54) + 1;
            for(int j = 0 ; j < number.length ; j++){
            if(rdmNum != number[j]){
                count++;
            }
            }
            if(count == number.length){
                break;
            }
            else
                count=0;
        }
        return rdmNum;
    }
}
