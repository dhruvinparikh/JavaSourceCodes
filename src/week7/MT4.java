/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author imsil
 * You have three identical prizes to give away and a pool of 30 finalists. 
 * The finalists are assigned numbers from 1 to 30. Write a program to randomly
 * select the numbers of three finalists to receive a prize. Make sure not to 
 * pick the same number twice. For example, picking finalists 3, 15, 29 would be 
 * valid but picking 3, 3, 31 would be invalid because finalist number 3 is 
 * listed twice and 31 is not a valid finalist number.
 */
public class MT4 {
    public static void main(String[] args){
        int random;
        
        random = 1 + (int)(Math.random() * 30);
        int finalistOne = random;
        
        random = 1 + (int)(Math.random() * 30);
        int finalistSecond = random;
        
        while(finalistOne == finalistSecond)
        {
            random = 1 + (int)(Math.random() * 30);
            finalistSecond = random;
        }
        
        random = 1 + (int)(Math.random() * 30);
        int finalistThird = random;
        
        while(finalistThird == finalistSecond || finalistThird == finalistOne)
        {
            random = 1 + (int)(Math.random() * 30);
            finalistThird = random;
        }
        
        System.out.println("Finalist#1: "+finalistOne);
        System.out.println("Finalist#1: "+finalistSecond);
        System.out.println("Finalist#1: "+finalistThird);
    }
}
