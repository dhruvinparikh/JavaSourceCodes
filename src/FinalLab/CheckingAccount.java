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
public class CheckingAccount extends Account{
    private double accountBalance;

    public CheckingAccount(String name, String accountNo, String address, String phone, double accountBalance) {
        super(name, accountNo, address, phone);
        this.accountBalance=accountBalance;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCheckingAccount" + "\naccountBalance=" + getAccountBalance() + '\n';
    }

    /**
     * @return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= getAccountBalance()) {
            setAccountBalance(getAccountBalance() - withdrawAmount);
        } else {
            System.out.println("Account limit exceeded");
        }
    }

    public void deposit(double depositAmount) {
        setAccountBalance(getAccountBalance() + depositAmount);
        System.out.println("Amount Successfully deposited : " + depositAmount);
    }

    public void transfer(CheckingAccount ac, double transferAmount) {
        this.withdraw(transferAmount);
        ac.deposit(transferAmount);
        System.out.println("Amount successfully transfered : " + transferAmount);
    }
}
