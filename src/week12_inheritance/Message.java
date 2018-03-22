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
public class Message {
    protected String text;

    public void setText(String text) {
        this.text = text;
    }

    public Message(String text) {
        this.text = text;
    }

    public String toString() {
        return "Message{" + "text = " + text + "}";
    }
    
    
}
