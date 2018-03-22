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
public class Account {
    private String name;
    private String accountNo;
    private String address;
    private String phone;

    public Account(String name, String accountNo, String address, String phone) {
        this.name = name;
        this.accountNo = accountNo;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Account\n" + "name=" + getName() + "\naccountNo=" + getAccountNo() + "\naddress=" + getAddress() + "\nphone=" + getPhone() + '\n';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the accountNo
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
