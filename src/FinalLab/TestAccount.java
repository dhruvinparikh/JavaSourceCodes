/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
why is there no deposit or withdraw or transfer functionality in checking account?
transfer should take the account to be transferred as a parameter..?﻿﻿﻿﻿﻿﻿﻿
 */
package FinalLab;

/**
 *
 * @author imsil
 */
public class TestAccount {
    public static void main(String[] args) {
        SavingsAccount savingsaccount1 = new SavingsAccount(500, "Dhruvin Parikh", "N01150847", "32 vespa hills cres", "+1-652-589-2356", 2121.12);
        
        System.out.println("---------------------------------------------------------------------------");
        displayAccountInfo(savingsaccount1);
        System.out.println("---------------------------------------------------------------------------");
        savingsaccount1.deposit(500);
        displayAccountInfo(savingsaccount1);
        System.out.println("---------------------------------------------------------------------------");
        savingsaccount1.withdraw(250);
        displayAccountInfo(savingsaccount1);
        
        SavingsAccount savingsaccount2 = new SavingsAccount(500,"Jose Smith","N10025698","45 yongestreet","+1-589-896-7845",0);
        System.out.println("---------------------------------------------------------------------------");
        savingsaccount2.withdraw(501);
        displayAccountInfo(savingsaccount2);
       System.out.println("---------------------------------------------------------------------------");
        savingsaccount2.deposit(500);
        displayAccountInfo(savingsaccount2);
        System.out.println("---------------------------------------------------------------------------");
        savingsaccount2.withdraw(250);
        displayAccountInfo(savingsaccount2);
        
        System.out.println("-----------------------------Transfer---------------------------------");
        savingsaccount1.transfer(savingsaccount2,250);
        System.out.println("----------------------------------------------------------------------");
        displayAccountInfo(savingsaccount1);
        System.out.println("----------------------------------------------------------------------");
        displayAccountInfo(savingsaccount2);
        System.out.println("-----------------------------Transfer---------------------------------");
        
    }
    
    public static void displayAccountInfo(Account obj){
        System.out.println(obj);
    }
}
