/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author n01150847
 */
public class MethodExercise3 {
    public static void main(String[] args) 	{

        System.out.println("I have some methods:");
        displayOne();
        System.out.println("That's all!");
    }

    public static void displayOne() {
        System.out.println("This is method one.");
        displayTwo();
        System.out.println("Going back to main...");
    }

    public static void displayTwo() {
        System.out.println("This is method two.");
    }

    
}
