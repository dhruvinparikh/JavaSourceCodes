/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author imsil (Count occurrence of numbers) Write a program that reads the
 * integers between 1 and 100 and counts the occurrences of each. Assume the
 * input ends with 0. Here is a sample run of the program: Programming Exercises
 * 277 Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0 2 occurs 2
 * times 3 occurs 1 time 4 occurs 1 time 5 occurs 2 times 6 occurs 1 time 23
 * occurs 1 time 43 occurs 1 time Note that if a number occurs more than one
 * time, the plural word “times” is used in the output.
 */
public class CountOccurrences {

    public static void main(String[] args) {
        int[] intNumbers = new int[100];
        int[] intOccurrences = new int[100];
        int number = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list of numbers ending with 0:");
        int index = 0;
        do {
            number = scanner.nextInt();
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
        } while (number != 0);
        
        System.out.println();
        
        for(int i = 0 ; i < index ; i++){
            System.out.printf("%d cccured %d times\n", intNumbers[i],intOccurrences[i]);
        }
    }
}
