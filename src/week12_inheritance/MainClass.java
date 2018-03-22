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
public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student("n01253102","ITS","Lezley Lee","John","Smith");
        Student student2 = new Student("n63218541","WPD","Emily Stuart","Adam","Gillchrist");
        
        System.out.println("Student-1");
        System.out.println(student1.displayDetails());
        System.out.println("Student-2");
        System.out.println(student2.displayDetails());
        
        Teacher teacher1 = new Teacher("Java Programming-1",16000,"Lezley","Lee");
        Teacher teacher2 = new Teacher("Web Programming and Designing",15000,"Emily","Stuart");
        
        System.out.println("Teacher-1");
        System.out.println(teacher1.displayDetails());
        System.out.println("Teacher-2");
        System.out.println(teacher2.displayDetails());
    }
}
