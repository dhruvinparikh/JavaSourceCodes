/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 * An Armstrong number is an n-digit number that equals the sum of the nth power
 * of its digits. For example 153 is a three-digit number where the sum of the
 * cubes of the individual digits (13 + 53 + 33) equals the number itself (153).
 * Write a program that takes as input the start and end numbers of an Armstrong
 * number range to be printed. Your program should prompt for new start and end
 * numbers until the user decides that she or he is through. Note: The numbers
 * can range in the entire integer range. So it could be numbers upto 9 digits.
 *
 * @author imsil
 */
public class ArmstrongNumberList {

    public static void main(String[] args) {

        int intDig1, intDig2, intDig3, intDig4, intDig5, intDig6, intDig7,
                intDig8, intDig9;

        char chrChoice = ' ';
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            if (chrChoice == 'N' || chrChoice == 'n') {
                break;
            }
            //Prompt Input from User
            System.out.print("Input starting range: ");
            int intRangeStart = scanner.nextInt();

            System.out.print("Input ending range: ");
            int intRangeEnd = scanner.nextInt();

            int intTemp, intDigitCount = 1;

            for (int i = intRangeStart; i <= intRangeEnd; i++) {
                intTemp = i;
                intDigitCount = 1;
                while (intTemp / 10 != 0) {
                    intTemp /= 10;
                    intDigitCount++;
                }
                switch (intDigitCount) {
                    case 1:

                        if ((int) (Math.pow((int) i, (int) intDigitCount)) == i) {
                            System.out.print(i + " ");
                        }
                        break;
                    case 2:
                        if ((int) (Math.pow((int) i / 10, (int) intDigitCount))
                                + (int) (Math.pow((int) i % 10, (int) intDigitCount)) == i) {
                            System.out.print(i + " ");
                        }
                        break;
                    case 3:
                        if ((int) (Math.pow((int) i % 10, (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10) / 10), (int) intDigitCount)) == i) {
                            System.out.print(i + " ");
                        }
                        break;
                    case 4:
                        if ((int) (Math.pow((int) i % 10, (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 100) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) (i / 1000), (int) intDigitCount)) == i) {
                            System.out.print(i + " ");
                        }
                        break;
                    case 5:
                        if ((int) (Math.pow((int) i % 10, (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 100) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 1000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) (i / 10000), (int) intDigitCount)) == i) {
                            System.out.print(i + " ");
                        }
                        break;
                    case 6:
                        if ((int) (Math.pow((int) i % 10, (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 100) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 1000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) (i / 100000), (int) intDigitCount)) == i) {
                            System.out.print(i + " ");
                        }
                        break;
                    case 7:
                        if ((int) (Math.pow((int) i % 10, (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 100) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 1000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 100000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) (i / 1000000), (int) intDigitCount)) == i) {
                            System.out.print(i + " ");
                        }
                        break;
                    case 8:
                        if ((int) (Math.pow((int) i % 10, (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 100) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 1000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 100000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 1000000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) (i / 10000000), (int) intDigitCount)) == i) {
                            System.out.print(i + " ");
                        }
                        break;
                    case 9:
                        if ((int) (Math.pow((int) i % 10, (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 100) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 1000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 100000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 1000000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) ((i / 10000000) % 10), (int) intDigitCount))
                                + (int) (Math.pow((int) (i / 100000000), (int) intDigitCount)) == i) {
                            System.out.print(i + " ");
                        }
                        break;

                }
            }
            System.out.println();
            System.out.print("Press N to exit, any other key to continue:");
            chrChoice = scanner.next().charAt(0);

            scanner = new Scanner(System.in);
        }
    }
}
