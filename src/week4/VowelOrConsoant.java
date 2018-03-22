package week4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imsilWrite a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant. Here is a sample run:
VideoNote
Convert hex to binary
Enter a letter: B
B is a consonant
Enter a letter grade: a
a is a vowel
Enter a letter grade: #
# is an invalid input
 */
public class VowelOrConsoant {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        char chrLetter = Character.toLowerCase(input.next().charAt(0));
        
        //Read character and convert to lower case 
        
        switch(chrLetter)
        {
            case'a': case 'e': case 'o': case 'i': case 'u':
                System.out.println(chrLetter + " is Vowel");
                break;
            default:
                System.out.println(chrLetter + " is Consonant");
                break;
        }
        
           
    }
}
