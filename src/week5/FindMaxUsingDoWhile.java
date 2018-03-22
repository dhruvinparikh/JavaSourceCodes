/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class FindMaxUsingDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers ending with 0");

        int number = Integer.MIN_VALUE;
        int maxNumber = number;

        do {
            number = scanner.nextInt();
            if (maxNumber < number) {
                maxNumber = number;
            }
        } while (number != 0);
        System.out.println("Maximum number entered is: " + maxNumber);
    }

}
