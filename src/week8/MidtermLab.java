/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author imsil Write a program that records test scores for a given number of
 * students.
 *
 * a. Ask the user for the number of students and record the test score and the
 * student name for all of them in two parallel arrays.
 *
 * b. Calculate/display the average of all the scores.
 *
 * c. Then, for each student, display if the score is above or below the average
 * (see sample output).
 *
 * Average Score: 78.2
 *
 * Results:Joe Schmoe: ABOVE Average
 *
 * Sally Smith: BELOW Average...
 *
 * Fred Flintstone: BELOW Average
 */
public class MidtermLab {

    public static void main(String[] args) {

        //Scanner object declaraion
        Scanner objScanner = new Scanner(System.in);
        
        Scanner strScanner = new Scanner(System.in);

        //Prompt user to get number of entries
        System.out.println("Enter # of students:");
        int intNumberOfStudents = objScanner.nextInt();
        
        String[] strStudentName = new String[intNumberOfStudents];
        int[] intStudentScore = new int[intNumberOfStudents];

        
        
        //Prompt test score and name for each studemt 
        for (int i = 0; i < intNumberOfStudents; i++) {
            
            System.out.printf("Name for student[%d]", i+1);
            String name = strScanner.nextLine();
            strStudentName[i] = "" + name;
            
            objScanner.nextLine();
            System.out.println("Enter score for " + strStudentName[i] +": ");
            intStudentScore[i] = objScanner.nextInt();
            System.out.println();
        }

        float sum = 0;
        
        for(int i = 0 ; i < intNumberOfStudents ; i++){
            sum += intStudentScore[i];
        }
        
        float intAverage = (float)sum/intNumberOfStudents;
        
        System.out.println("Average: " + intAverage);
        
        for(int i = 0 ; i < intNumberOfStudents ; i++){
            System.out.print("Name:" + strStudentName[i]);
            
            if(intStudentScore[i] > intAverage)
                System.out.println(" Above Average\n");
            else
                System.out.println(" Below Average\n");
        }
    }

}
