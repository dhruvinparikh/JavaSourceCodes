/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class Week6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
int ik = 0;
     for (ik = 0; ik < 10; ik++);
       System.out.println(ik + 4); 
        
        int[] intNumbers = new int[100];
        int[] intOccurrences = new int[100];
        int number = 0;
        int intCount = 0, index = 0;

        while (intCount < 100) {
            number = 1 + (int) (Math.random() * 10);
            int i = 0;
            for (i = 0; i < intNumbers.length; i++) {
                if (number == intNumbers[i]) {
                    break;
                }
            }
            if (i < intNumbers.length) {
                intOccurrences[i]++;
            } else {
                intNumbers[index] = number;
                intOccurrences[index] = 1;
                index++;
            }
            intCount++;
        }
        System.out.println("Number  Number of times occurred");

        for (int i = 0; i < index; i++) {
            System.out.printf("%3d%15d\n", intNumbers[i], intOccurrences[i]);
        }
    }
}
