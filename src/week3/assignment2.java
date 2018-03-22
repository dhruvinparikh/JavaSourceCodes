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
public class assignment2 {

    public static void main(String[] args) {

        //Get the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 6-digit number:");
        long intNumerals = scanner.nextLong();

        int intN1 = (int) (intNumerals / 100000);
        int intN2 = (int) (intNumerals / 10000) % 10;
        int intN3 = (int) (intNumerals / 1000) % 10;
        int intN4 = (int) (intNumerals / 100) % 10;
        int intN5 = (int) (intNumerals / 10) % 10;
        int intN6 = (int) (intNumerals % 10);

        boolean boolOutput1 = intN1 % 2 == 0;
        boolean boolOutput2 = intN6 % 2 == 0;

        if (boolOutput1 == true && boolOutput2 == true) {
            System.out.print("$");
        } else if (boolOutput1 == false && boolOutput2 == false) {
            System.out.print("X");
        } else {
            switch (intN1) {
                case 0:
                    System.out.print("*");
                    break;
                case 1:
                    System.out.print("B");
                    break;
                case 2:
                    System.out.print("E");
                    break;
                case 3:
                    System.out.print("A");
                    break;
                case 4:
                    System.out.print("@");
                    break;
                case 5:
                    System.out.print("F");
                    break;
                case 6:
                    System.out.print("K");
                    break;
                case 7:
                    System.out.print("%");
                    break;
                case 8:
                    System.out.print("R");
                    break;
                case 9:
                    System.out.print("M");
                    break;
            }
        }
        switch (intN2) {
            case 0:
                System.out.print("*");
                break;
            case 1:
                System.out.print("B");
                break;
            case 2:
                System.out.print("E");
                break;
            case 3:
                System.out.print("A");
                break;
            case 4:
                System.out.print("@");
                break;
            case 5:
                System.out.print("F");
                break;
            case 6:
                System.out.print("K");
                break;
            case 7:
                System.out.print("%");
                break;
            case 8:
                System.out.print("R");
                break;
            case 9:
                System.out.print("M");
                break;
        }
        switch (intN3) {
            case 0:
                System.out.print("*");
                break;
            case 1:
                System.out.print("B");
                break;
            case 2:
                System.out.print("E");
                break;
            case 3:
                System.out.print("A");
                break;
            case 4:
                System.out.print("@");
                break;
            case 5:
                System.out.print("F");
                break;
            case 6:
                System.out.print("K");
                break;
            case 7:
                System.out.print("%");
                break;
            case 8:
                System.out.print("R");
                break;
            case 9:
                System.out.print("M");
                break;
        }
        switch (intN4) {
            case 0:
                System.out.print("*");
                break;
            case 1:
                System.out.print("B");
                break;
            case 2:
                System.out.print("E");
                break;
            case 3:
                System.out.print("A");
                break;
            case 4:
                System.out.print("@");
                break;
            case 5:
                System.out.print("F");
                break;
            case 6:
                System.out.print("K");
                break;
            case 7:
                System.out.print("%");
                //break;
            case 8:
                System.out.print("R");
                break;
            case 9:
                System.out.print("M");
                break;
        }
        switch (intN5) {
            case 0:
                System.out.print("*");
                break;
            case 1:
                System.out.print("B");
                break;
            case 2:
                System.out.print("E");
                break;
            case 3:
                System.out.print("A");
                break;
            case 4:
                System.out.print("@");
                break;
            case 5:
                System.out.print("F");
                break;
            case 6:
                System.out.print("K");
                break;
            case 7:
                System.out.print("%");
                break;
            case 8:
                System.out.print("R");
                break;
            case 9:
                System.out.print("M");
                break;
        }

        if (boolOutput1 == true && boolOutput2 == true) {
            if(intN6 == 0)
            {
                System.out.print("#");
            }
            else
            {
            System.out.print("$");
            }
        } else if (boolOutput1 == false && boolOutput2 == false) {
                System.out.print("X");
            }
        else {
            switch (intN6) {
                case 0:
                    System.out.print("#");
                    break;
                case 1:
                    System.out.print("B");
                    break;
                case 2:
                    System.out.print("E");
                    break;
                case 3:
                    System.out.print("A");
                    break;
                case 4:
                    System.out.print("@");
                    break;
                case 5:
                    System.out.print("F");
                    break;
                case 6:
                    System.out.print("K");
                    break;
                case 7:
                    System.out.print("%");
                    break;
                case 8:
                    System.out.print("R");
                    break;
                case 9:
                    System.out.print("M");
                    break;
            }
        }
        System.out.println();
    }

}
