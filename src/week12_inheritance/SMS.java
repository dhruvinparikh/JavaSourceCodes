/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_inheritance;

/**
 *
 * @author imsil
 */
public class SMS extends Message{
    private String recipientContactNo;

    public SMS(String recipientContactNo,String text) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }
    
    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }    

    @Override
    public String toString() {
        return super.toString()+"\nSMS{" + "recipientContactNo=" + getRecipientContactNo() + "}";
    }
    
    
}
