/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author imsil
 * Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.
 */
public class MethodPalindrome {
    
    public static int reverse(int number){
        
        int reverse = 0;
        
        while(number > 0){
            reverse = reverse * 10 + number%10;
            number /= 10;
        }
        
        return reverse;
    }
    
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
    
    public static void main(String[] args){
        System.out.printf("%d is a Palindrome is %b",124,isPalindrome(124));
    }
    
}
