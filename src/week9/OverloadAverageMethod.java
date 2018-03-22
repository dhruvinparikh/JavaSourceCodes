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
 * 4.	Write two overloaded methods that return the average of an array with 
 * the following headers:
public static int average(int[] array)
public static double average(double[] array)

 */
public class OverloadAverageMethod {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integer array Size : ");
        int intSize = scanner.nextInt();
        
        int[] intArray = new int[intSize];
        
        System.out.println("Input "+intSize+" integer numbers:");
        for(int i = 0 ; i < intSize ; i++){
            intArray[i] = scanner.nextInt();
        }
        
        System.out.println("Enter double array Size : ");
        int dblSize = scanner.nextInt();
        
        double[] dblArray = new double[dblSize];
        
        System.out.println("Input "+dblSize+" whole numbers:");
        
        for(int i = 0 ; i < dblSize ; i++){
            dblArray[i] = scanner.nextDouble();
        }
        
        System.out.println("Integer average : " + average(intArray));
        System.out.println("Double average : " + average(dblArray));
    }
   public static int average(int[] array){
       int sum = 0;
       for(int i = 0; i < array.length ; i++){
           sum += array[i];
       }
       
       return sum/array.length;
       
   } 
   public static double average(double[] array){
       double sum = 0;
       for(int i = 0; i < array.length ; i++){
           sum += array[i];
       }
       
       return sum/array.length;
   }
}
