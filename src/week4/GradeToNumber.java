package week4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author imsil
 */
public class GradeToNumber {

    public static void main(String[] args) {
        
           
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade");
        char chrGrade = Character.toUpperCase(scanner.next().charAt(0));

        if (chrGrade == 'A' || chrGrade == 'B' || chrGrade == 'C' || chrGrade == 'D' || chrGrade == 'F') {
            System.out.printf("Numeric value for grade %s is ", chrGrade);
        }

        switch (chrGrade) {
            case 'A':
                System.out.println("4");
                break;
            case 'B':
                System.out.println("3");
                break;
            case 'C':
                System.out.println("2");
                break;
            case 'D':
                System.out.println("1");
                break;
            case 'F':
                System.out.println("0");
                break;
            default:
                System.out.printf("%s is an invlaid grade\n", chrGrade);
                break;
        }
    }

}
