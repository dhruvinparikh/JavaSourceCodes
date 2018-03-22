/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author imsil
 */

public class TestDice {
    public static void main(String[] args){
        Dice dice = new Dice();
        int[] sumRoll = new int[11];
        boolean[] occurenceSum = new boolean[11];
       
        System.out.println("Starting the game!");
        
        for(int i= 0 ; i < 11 ; i++){
            System.out.println("Round " + (i + 1) + "...");
            sumRoll[i] = dice.sum();
            occurenceSum[sumRoll[i]-2] = true;
            System.out.println(dice + " (" + sumRoll[i] + ")");
        }
        int score=0;
        System.out.println("Your results:");
        for(int i = 0 ; i < 11 ; i++){
            System.out.print((i+2)+": ");
            if(occurenceSum[i]){
                System.out.println("Yes");
                score += (i+2);
            }
            else{
                System.out.println("No");
            }
        }
        System.out.println("Your total score:" + score);
    }
    
}
