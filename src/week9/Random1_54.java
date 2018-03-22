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
 */
public class Random1_54 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of elements(not more than 54): ");
        int intSize = scanner.nextInt();
        
        int[] intArray = new int[intSize];
        
        System.out.println("Input " + intSize + " elements: ");
        for(int i = 0 ; i < intSize ; i++){
            intArray[i] = scanner.nextInt();
        }
        
        getRandom(intArray);
    }
    
    public static void getRandom(int... number){
        int rdmNum,i;
        boolean flag1 = true,flag2 = true;
        i=0;
        int count=0;
        int[] recordNum = new int[54-number.length];
        
        System.out.println("Output:");
        
        while(true){
            rdmNum = (int)(Math.random() * 54) + 1;
            for(int j = 0 ; j < number.length ; j++){
            if(rdmNum == number[j]){
                flag1 = false;
                break;
            }
            }
            for(int j = 0 ; j < recordNum.length ; j++){
                if(rdmNum == recordNum[j]){
                    flag2 = false;
                }
            }
            
            if(flag1 && flag2){
                recordNum[count] = rdmNum;
                System.out.printf("%-3d",rdmNum);
                count++;
                if(count%5 == 0)
                    System.out.println();
            }
            if(count > 53-number.length){
                break;
            }
            flag1 = flag2 = true;
        }
    }
}
