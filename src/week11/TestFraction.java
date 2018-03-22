/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class TestFraction {
    public static void main(String[] args){
        Fraction fraction1 = new Fraction();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numerator:");
        int numerator = scanner.nextInt();
        System.out.println("Enter Dumerator:");
        int denominator = scanner.nextInt();
        
        fraction1.setNumerator(numerator);
        fraction1.setDenominator(denominator);
        
        System.out.println(fraction1);
        System.out.println("Fraction1 value:"+fraction1.getValue());
        
        
        Fraction fraction2 = new Fraction();
        System.out.println("Enter Numerator:");
        numerator = scanner.nextInt();
        System.out.println("Enter Dumerator:");
        denominator = scanner.nextInt();
        fraction2.setNumerator(numerator);
        fraction2.setDenominator(denominator);
        System.out.println(fraction2);
        System.out.println("Fraction2 value:"+fraction2.getValue());
        System.out.println("fraction1 and fraction2 are equal is "+fraction1.equals(fraction2));
    }
}
