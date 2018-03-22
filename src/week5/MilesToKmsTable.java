/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author imsil
 * (Conversion from miles to kilometers) Write a program that displays the following
table (note that 1 mile is 1.609 kilometers):
Miles Kilometers
1 1.609
2 3.218
...
9 14.481
10 16.090
 */
public class MilesToKmsTable {
    public static void main(String[] args){
        final double MILES_2_KMS = 1.609;
        int counter = 1;
        
        //-By system.out.print method
        System.out.println("Miles  Kilometers");
        while(counter < 11)
        {
            System.out.println(counter + "      " + (int)(counter++*MILES_2_KMS * 1000)/1000.0);
        }
        
        //-By system.out.printf method
        counter = 1;
        System.out.printf("%-7s%-11s\n","Miles","Kilometers");
        while(counter < 11)
        {
            System.out.printf("%-7d%-12.3f\n",counter,MILES_2_KMS * counter++);
        }
    }
            
    
}
