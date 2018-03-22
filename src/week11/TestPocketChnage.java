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
public class TestPocketChnage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PocketChange pocketChange = new PocketChange();
        
        System.out.println("Enter Tonies:");
        int toonies = scanner.nextInt();
        System.out.println("Enter loonies:");
        int loonies = scanner.nextInt();
        System.out.println("Enter Quarters:");
        int quarters = scanner.nextInt();
        System.out.println("Enter Dimes:");
        int dimes=scanner.nextInt();
        System.out.println("Enter Nickels");
        int nickels=scanner.nextInt();
        System.out.println("Enter Pennies");
        int pennies = scanner.nextInt();
        
        pocketChange.setToonies(toonies);
        pocketChange.setLoonies(loonies);
        pocketChange.setQuarters(quarters);
        pocketChange.setDimes(dimes);
        pocketChange.setNickels(nickels);
        pocketChange.setPennies(pennies);
        
        System.out.println(pocketChange);
        
        System.out.println("Total amount in pocket:"+pocketChange.calcAmount());
    }
}
