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
public class Person {
protected String firstName;
protected String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String displayDetails(){
        return "First : "+firstName+"\nLast : "+lastName+"\n";
    }
}
