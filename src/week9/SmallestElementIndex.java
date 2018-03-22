/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author imsil
 * 5.	Write a method that returns the index of the smallest element in an 
 * array of integers. If the number of such elements is greater than  1, 
 * return the smallest index. Use the following header:

public static int indexOfSmallestElement(double[] array)

 */
public class SmallestElementIndex {
    public static void main(String[] args){
        double[] array = {50,40,5,20,10,25};
        
        System.out.println("Index of smallest Element : " + indexOfSmallestElement(array));
    }
    
    public static int indexOfSmallestElement(double[] array){
        
        double minElement = array[0];
        int indexSmall = 0;
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] < minElement){
                minElement = array[i];
                indexSmall = i;
            }
        }
        
        if(minElement >= 1)
            return indexSmall;
            else
            return -1;
            
    }
    
}
