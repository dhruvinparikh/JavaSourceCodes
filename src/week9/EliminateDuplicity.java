/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author imsil
 * 7.	Write a method that returns a new array by eliminating the duplicate 
 * values in the array by using the following method header:

public static int[] eliminateDuplicates(int[] list)

 */
public class EliminateDuplicity {
    
    public static void main(String[] args){
        
        int[] list = {20,5,10,10,20,30,30,40,40,10,20,30,40};
        
        int[] revList = eliminateDuplicates(list);
        
        System.out.println("Revised array list : ");
        for(int i = 0 ; i < revList.length ; i++){
            System.out.print(revList[i] + " ");
        }
    }
    public static int[] eliminateDuplicates(int[] list){
        
        int arrayLength = list.length;
        
        for(int i = 0 ; i < arrayLength ; i++){
            for(int j = i+1 ; j < arrayLength ; j++){
                if(list[i] == list[j]){
                    int left = j;
                    for(int k = j+1 ; k < arrayLength ; k++){
                        list[left] = list[k];
                        left++;
                    }
                    arrayLength--;
                    j--;
                }
            }
            
        }
        
        int[] newArray = new int[arrayLength];
        
        for(int i = 0 ; i < arrayLength ; i++){
            newArray[i] = list[i];
        }
        return newArray;
    }
    
}
