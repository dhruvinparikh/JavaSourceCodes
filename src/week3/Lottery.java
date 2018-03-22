/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class Lottery {

    public static void main(String[] args) {
        int intRandomWinning = (int) (Math.random() * 1000);
        if (intRandomWinning < 100) {
            intRandomWinning += 100;
        }

       System.out.println(intRandomWinning);

        int rd3 = intRandomWinning % 10;
        int rd2 = (intRandomWinning / 10) % 10;
        int rd1 = intRandomWinning / 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lottery number:");
        int intUserLottery = scanner.nextInt();

        int ud3 = intUserLottery % 10;
        int ud2 = (intUserLottery / 10) % 10;
        int ud1 = intUserLottery / 100;

        //validating user input to have 3 digits
        if (intUserLottery >= 100 && intUserLottery <= 999) {
            if (intUserLottery == intRandomWinning) {
                System.out.println("You won $10000");
            } else if (((rd3 == ud3) || (rd3 == ud2) || (rd3 == ud1))
                    && ((rd2 == ud3) || (rd2 == ud2) || (rd2 == ud1))
                    && ((rd1 == ud3) || (rd1 == ud2) || (rd1 == ud1))) {
                if (ud1 == ud2) {
                    if (rd1 == rd2 && rd1 == ud1) {
                        System.out.println("You won $3000");
                    } else if (rd1 == rd3 && rd1 == ud1) {
                        System.out.println("You won $3000");
                    } else if (rd2 == rd3 && rd2 == ud1) {
                        System.out.println("You won $3000");
                    } else {
                        System.out.println("You won $1000");
                    }
                } else if (ud1 == ud3) {
                    if (rd1 == rd2 && rd1 == ud1) {
                        System.out.println("You won $3000");
                    } else if (rd1 == rd3 && rd1 == ud1) {
                        System.out.println("You won $3000");
                    } else if (rd2 == rd3 && rd2 == ud1) {
                        System.out.println("You won $3000");
                    } else {
                        System.out.println("You won $1000");
                    }
                } else if (ud2 == ud3) {
                    if (rd1 == rd2 && rd1 == ud2) {
                        System.out.println("You won $3000");
                    } else if (rd1 == rd3 && rd1 == ud2) {
                        System.out.println("You won $3000");
                    } else if (rd2 == rd3 && rd2 == ud2) {
                        System.out.println("You won $3000");
                    } else {
                        System.out.println("You won $1000");
                    }
                } else {
                    System.out.println("You won $3000");
                }
            } else if (((rd3 == ud3) || (rd3 == ud2) || (rd3 == ud1))
                    || ((rd2 == ud3) || (rd2 == ud2) || (rd2 == ud1))
                    || ((rd1 == ud3) || (rd1 == ud2) || (rd1 == ud1))) {
                System.out.println("You won $1000");
            }
        } else {
            System.out.println("Lottery number should be 3 digits.");
        }
    }
}
