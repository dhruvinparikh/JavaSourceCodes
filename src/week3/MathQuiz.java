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
public class MathQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int intN1 = (int)(Math.random()*10) + 1;
        int intN2 = (int)(Math.random()*10) + 1;

         Scanner scanner = new Scanner(System.in);
        System.out.println("What is " + intN1 + " + " + intN2);
        int intUserAns = scanner.nextInt();
        
        boolean boolOutput = intUserAns == (intN1 + intN2);
        System.out.println(intN1 + " + " + intN2 + " = " + intUserAns + " is " + boolOutput);
        }
    
}
