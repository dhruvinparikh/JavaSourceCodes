/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalLab;

/**
 *
 * @author imsil
 */
public class SavingsAccount extends CheckingAccount{
   private  double overDraftProtection;

    public double getOverDraftProtection() {
        return overDraftProtection;
    }

    public void setOverDraftProtection(double overDraftProtection) {
        this.overDraftProtection = overDraftProtection;
    }

    public SavingsAccount(double overDraftProtection, String name, String accountNo, String address, String phone, double accountBalance) {
        super(name, accountNo, address, phone, accountBalance);
        this.overDraftProtection = overDraftProtection;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSavingsAccount" + "\noverDraftProtection=" + overDraftProtection + '\n';
    }
   
   public void withdraw(double withdrawAmount){
       if(withdrawAmount <= super.getAccountBalance()){
        super.setAccountBalance(super.getAccountBalance()-withdrawAmount);
           System.out.println("Amount succesfully withdrawn : " + withdrawAmount);
           System.out.println("No change in Over Draft limit ");
       }
       else{if (withdrawAmount <= this.overDraftProtection){
            this.overDraftProtection -= withdrawAmount;
            System.out.println("Amount succesfully withdrawn : " + withdrawAmount);
            System.out.println("Over draft limit : " + this.overDraftProtection);
        }
       else
               System.out.println("OverDraft limit exceeded");
       }
    }
    public void deposit(double depositAmount){
        super.setAccountBalance(super.getAccountBalance()+ depositAmount);
        System.out.println("Amount Successfully deposited : " + depositAmount);
    }
    
}
