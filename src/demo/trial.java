/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class trial {
 private boolean x;
 static Scanner scan = new Scanner(System.in);
 static int c = 1;
    public static void main(String[] args){
        
       int num = 0;
       
    while (c == 1) {
        try {
            System.out.println("enter a number");
            num = Integer.parseInt(scan.nextLine());
            c = 2;
        } catch (Exception e) {
            System.out.println("enter a Number please : ");
        }
    }

        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter  nos. :");
        int size = scanner.nextInt();
        
        int[] testArray = new int[size];
        int[] a = new int[size];
        
        System.out.println("Enter " + size +"  nos. :");
        
        for(int i = 0 ; i < testArray.length ; i++){
            testArray[i] = scanner.nextInt();
            a[i] = testArray[i];
        }
        
        for(int i = 0 ; i < testArray.length ; i++){
            System.out.printf("testArray[%d] = %d\n",i,testArray[i]);
        }
        /*Logic for sorting ascending*/
        int min = testArray[0];
        
        for(int i = 1 ; i < testArray.length ; i++){
            for(int j = 1 ; j < testArray.length ; j++){
                if(testArray[j] < min){
                    int temp  = testArray[j-1];
                    testArray[j-1] = testArray[j];
                    testArray[j] = temp;
                }
                min = testArray[j];
            }
            min = testArray[0];
        }
        System.out.println("Ascending");
        for(int i = 0 ; i < testArray.length ; i++){
            System.out.printf("testArray[%d] = %d\n",i,testArray[i]);
        }
        /*logic for descending*/
        int max = a[0];
        
        for(int i = 1 ; i < a.length ; i++){
            for(int j = 1 ; j < a.length ; j++){
                if(a[j] > max){
                    int temp  = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
                max = a[j];
            }
            max = a[0];
        }
        System.out.println("Descending");
        for(int i = 0 ; i < testArray.length ; i++){
            System.out.printf("a[%d] = %d\n",i,a[i]);
        }
}
}
