/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;

/**
 *
 * @author imsil
 * 2. In a certain code language, numerals are each represented by a symbol or a letter.
They are as follows
Numeral 0 1 2 3 4 5 6 7 8 9
Symbol code * B E A @ F K % R M
Numerals are to be coded as per the codes in the table and the following conditions:
a. If the first and the last digits are odd, both are to be coded as ‘X’.
b. If the first and the last digits are even, both are to be coded as ‘$’.
c. If the last digit is ‘0’, it is to be coded as ‘#’.
For example, 487692 is coded as $R%KM$
Write a program that takes as input a sequence of numbers and displays the corresponding
code to represent it.
 */
public class MTR2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of digits in the sequence");
        int size = scanner.nextInt();
        char[] encodedOutput = new char[size];
        int[] number = new int[size];
        
        System.out.println("Enter number sequence");
        
        for(int i = 0 ; i < size ; i++){
            number[i] = scanner.nextInt();
            
            switch(number[i]){
                case 0: encodedOutput[i] = '*';break;
                case 1: encodedOutput[i] = 'B';break;
                case 2: encodedOutput[i] = 'E';break;
                case 3: encodedOutput[i] = 'A';break;
                case 4: encodedOutput[i] = '@';break;
                case 5: encodedOutput[i] = 'F';break;
                case 6: encodedOutput[i] = 'K';break;
                case 7: encodedOutput[i] = '%';break;
                case 8: encodedOutput[i] = 'R';break;
                case 9: encodedOutput[i] = 'M';
            }
        }
        
        if(number[0] % 2 == 1 && number[number.length-1] % 2 == 1){
            encodedOutput[0] = 'X';
            encodedOutput[number.length-1] = 'X';
        }
        else if(number[0] % 2 == 0 && number[number.length-1] % 2 == 0 && number[number.length-1] != 0){
            encodedOutput[0] = '$';
            encodedOutput[number.length-1] = '$';
        }
        else if(number[number.length - 1] == 0){
            encodedOutput[number.length - 1] = '#';
        }
        
        /*
        else if(number[0]%2 == 0 && number[number.length-1] % 2 == 0)
        {
        if(number[number.length-1) != 0)
            encodedOutput[0] = '$';
        else
            encodedOutput[number.length - 1] = '#';
        }
        */
        
        for(char elem : encodedOutput){
            System.out.print(elem);
        }
    }
}
