/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 * Write a program that displays all the numbers from 100 to 200, ten per line,
 * that are divisible by 5 or 6, but not both. Numbers are separated by exactly
 * one space.
 *
 * @author imsil
 */
public class UsingForLoop {

    public static void main(String[] args) {
        int numberCount = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.print(i + " ");
                numberCount++;
                if (numberCount % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
