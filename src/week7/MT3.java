/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;

/**
 *
 * @author imsil 4. Write a program that takes one of the five vowels (a, e, i,
 * o, and u) and a string as input from the user and checks each word of the
 * input to determine whether or not it starts with that vowel. Then, it should
 * also display those words on the screen, one word per line.
 */
public class MT3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vowel to search");
        char vowel = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println("Enter the string in which to search");
        String strSentence = scanner.nextLine();
        String word = "";
        while (strSentence.length() != 0) {
            if(strSentence.indexOf(" ") == -1)
            {
                word = strSentence;
                strSentence = "";
            }
            else
            {
                word = strSentence.substring(0,strSentence.indexOf(" "));
                strSentence = strSentence.substring(strSentence.indexOf(" ")+1);
            }
            if(word.charAt(0) == vowel)
                System.out.println(word);
            }
        }
    }
