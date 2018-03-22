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
public class CompareTime {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time 1 in HH:MM:SS");
        String strTime1 = scanner.next();
        System.out.println("Enter time 2 in HH:MM:SS");
        String strTime2 = scanner.next();
        
        int intH1 = Integer.parseInt(strTime1.substring(0,2));
        int intM1 = Integer.parseInt(strTime1.substring(3,5));
        int intS1 = Integer.parseInt(strTime1.substring(6,8));
        
        int intTime1 = intH1 * 3600 + intM1 * 60 + intS1;
        
        int intH2 = Integer.parseInt(strTime2.substring(0,strTime2.indexOf(':')));
        int intM2 = Integer.parseInt(strTime2.substring(strTime2.indexOf(':') + 1, strTime2.lastIndexOf(':')));
        int intS2 = Integer.parseInt(strTime2.substring(strTime2.lastIndexOf(':') + 1));
        
        int intTime2 = intH2 * 3600 + intM2 * 60 + intS2;
        
        if(intTime1 > intTime2)
            System.out.println("Difference in time is " + (intTime1 - intTime2) + " seconds");
        else
            System.out.println("Difference in time is " + (intTime2 - intTime1) + " seconds");
    }
    
}
