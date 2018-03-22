/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author imsil
 */
public class RandomNumberOccurrences {

    public static void main(String[] args) {
         
        int[] intNumbers = new int[100];
        int intOccurrences = 1;
        int number = 0, i;

        for (i = 0; i < 100; i++) {
            intNumbers[i] = 1 + (int) (Math.random() * 10);
        }
        java.util.Arrays.sort(intNumbers);
        System.out.println("Number  Number of times occurred");
        number = intNumbers[0];
        for (i = 1; i < intNumbers.length; i++) {
            if (number == intNumbers[i]) {
                intOccurrences++;
            } else {
                number = intNumbers[i];
                System.out.printf("%3d%15d\n", intNumbers[i - 1], intOccurrences);
                intOccurrences = 1;
            }
        }
        System.out.printf("%3d%15d\n", intNumbers[i - 1], intOccurrences);
    }
}