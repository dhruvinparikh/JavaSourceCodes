/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author imsil
 * 3.	Write a method that finds the number of occurences of a specified 
 * character in a string using the following header:
public static int count(String str, char a)

 */
public class CharacterOccurrence {
public static void main(String[] args){
    System.out.println("Occurrence is " + count("This is java class",'s') + " times");
}    
public static int count(String str, char a){

    int countOcc = 0;
    for(int i = 0 ; i < str.length() ; i++){
        if(str.charAt(i) == a){
            countOcc++;
        }
    }
    return countOcc;
}
}

