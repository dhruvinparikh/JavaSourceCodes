/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;

/**
 *
 * @author venkatsa
 */
public class MusicStore {

    static CD[] cdList = new CD[4];
    static DVD[] dvdList = new DVD[4];
    static String[] userName = new String[10];
    static String[] password = new String[10];
    public static void createStub() {
      
        //com from a file or from a database
        cdList[0] = new CD("Vivaldi", "Four Seasons", 12.99, 20);
        cdList[1] = new CD("Henry Rollins", "Weight", 10.00, 18);
        cdList[2] = new CD("William Shatner", "Has Been", 15.99, 15);
        cdList[3] = new CD("Big Sugar", "Hit and Run", 16.99, 12);

        dvdList[0] = new DVD("ABC", "XYZ", 12.99, 5, 10);
        dvdList[1] = new DVD("BCD", "ZYS", 13.81, 7, 14);
        dvdList[2] = new DVD("CDE", "ZMM", 23.3, 12, 23);
        dvdList[3] = new DVD("DDD", "YYY", 11.99, 20, 19);
        
        userName[0]="admin";
        password[0]="password";

    }
   
    public static void main(String[] args) {
        createStub();
        System.out.println("Welcome to the store");

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username:");
        String userN = scanner.nextLine();
        //scanner.next();
        System.out.println("Enter password");
        String pass = scanner.nextLine();
        //scanner.nextLine();
     
        boolean go = true;
        
        while(go){
        
        if(userN.equals(userName[0]) && pass.equals(password[0])){
        Scanner in = new Scanner(System.in);
        String strTitle = "";
        int intCopies = 0;
        boolean willContinue = false;
        double totalCost = 0;
        String output = "Receipt:\n";
        do {
            System.out.println("What would you like to buy."
                    + "Enter 1 for CD and 2 for DVD");
            int userOption = in.nextInt();
            switch (userOption) {
                case 1:
                    System.out.println("Enter the CD you want to buy");
                    in.nextLine();
                    strTitle = in.nextLine();
                    int index = searchCDList(strTitle);
                    if (index >= 0) {
                        System.out.println("Enter the number of copies");
                        intCopies = in.nextInt();
                        totalCost += cdList[index].getPrice() * intCopies;
                        output+=String.format("%5d copies of Title: %-20s by Artist %-20s @ %-10.2f"
                                + ": %-10.2f%n", intCopies,cdList[index].getTitle(),
                                cdList[index].getArtist(),cdList[index].getPrice(),
                                cdList[index].getPrice() * intCopies);
                       
                        System.out.println("Continue shopping Y/N?");
                        if (in.next().equalsIgnoreCase("Y")) {
                            willContinue = true;
                        }else
                            willContinue = false;
                            go = false;
                    }
                    else
                        System.out.println("CD not found");
            }
        } while (willContinue);
        System.out.println(output);
        System.out.println("Total Cost: "+ totalCost);
    }
        else{
            System.out.println("Password/username not found");
            System.out.println("Enter e to exit, any other to continue");
            char chrExit = scanner.next().charAt(0);
            if(chrExit == 'e' || chrExit == 'E'){
                go = false;
            }
            else{
                System.out.println("Enter usename:");
            userN = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Enter password");
            pass = scanner.nextLine();
            scanner.next();
                System.out.println(password);
            }
            
        }
        }
    }
   
    public static int searchCDList(String title) {
        int foundIndex = -1;
        for (int i = 0; i < cdList.length; i++) {
            if (cdList[i].getTitle().equals(title)) {
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    }

}
