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
public class InitialiseArrays {

    public static void main(String[] args) {
        double[] dblArray = new double[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 decimal number:");

        //Initialising elements in an array
        for (int i = 0; i < 5; i++) {
            dblArray[i] = scanner.nextDouble();
        }

        //Displaying elements in an array
        for (int i = 0; i < dblArray.length; i++) {
            System.out.println("dblArray[" + i + "] = " + dblArray[i]);
        }
        
        //Displaying elements in an array through enhanced for loop
        System.out.println("Printing all elements in the array");
        for (double elem: dblArray) {
            System.out.println(elem);
        }

        //Summing all the elements
        double sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += dblArray[i];
        }

        System.out.println("Sum of all elements in an array is " + sum);

        //Largest element in an array
        double max = Double.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            if (max < dblArray[i]) {
                max = dblArray[i];
            }
        }
        System.out.println("Largest element in an array is " + max);

        //Smallest index of largest element
        max = Double.MIN_VALUE;
        int smallestIndex = 0;

        for (int i = 0; i < 5; i++) {
            if (max < dblArray[i]) {
                max = dblArray[i];
                smallestIndex = i;
            }
        }
        System.out.println("Smallest index of largest element in an array is " + smallestIndex);
        
        //largest index of larges element
        max = Double.MIN_VALUE;
        int largestIndex = 0;

        for (int i = 0; i < 5; i++) {
            if (max < dblArray[i]) {
                max = dblArray[i];
            } //smallestIndex = i;
            else if (max == dblArray[i]) {
                largestIndex = i;
            }
        }
        System.out.println("Largest index of largest element in an array is " + largestIndex);
    }
}
