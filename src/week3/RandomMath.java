/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author imsil
 */
public class RandomMath {
    public static void main(String[] args){
        int number = (int)(Math.random()*100) + 1;
        int month = number%12 + 1;
        
        if(month == 1)
            System.out.println("Jan");
        else if(month == 2)
            System.out.println("Feb");
        else if(month == 3)
            System.out.println("Mar");
        else if(month == 4)
            System.out.println("April");
        else if(month == 5)
            System.out.println("May");
        else if(month == 6)
            System.out.println("June");
        else if(month == 7)
            System.out.println("July");
        else if(month == 8)
            System.out.println("Aug");
        else if(month == 9)
            System.out.println("Sept");
        else if(month == 10)
            System.out.println("Oct");
        else if(month == 11)
            System.out.println("Nov");
        else
            System.out.println("Dec");
    }
    
}
