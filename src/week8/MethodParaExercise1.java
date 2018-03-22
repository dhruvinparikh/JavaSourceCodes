/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author n01150847
 */
public class MethodParaExercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter grade");
        int intGrade = scanner.nextInt();
        
        System.out.println("You have got " + getAlpha(intGrade)+ " grade.");
    }
    
    public static char getAlpha(int intGrade){
        char letterGrade;
        
        if(intGrade >= 90){
            letterGrade = 'A';
        }
        else if(intGrade > 70 && intGrade < 90){
            letterGrade = 'B';
        }
        else{
            letterGrade = 'C';
        }
        return letterGrade;
    }
}
