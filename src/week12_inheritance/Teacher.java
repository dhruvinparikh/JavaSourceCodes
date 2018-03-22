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
public class Teacher extends Person{
    private String subName;
    private double salary;

    public Teacher(String subName, double salary, String firstName, String lastName) {
        super(firstName, lastName);
        this.subName = subName;
        this.salary = salary;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }    
    
    public String displayDetails(){
        return super.displayDetails()+"Subject Name : " + subName + "\nSalary : " + salary + "\n";
    }
}
