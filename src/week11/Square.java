/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author imsil
 * Write a class called Square that models a basic Square shape:
Class: Square
Data: double side
Methods: double calcArea() double calcPerimeter() String toString()
The toString() method is actually a special method that's already part of Java. 
* We'll learn more about toString() and where it comes from in a later class. 
* For the Square class, the toString() method builds a formatted String that 
* represents the Square, for example, as:
Square: x.x by x.x
Where x.x is the side value, formatted to 1 decimal point. The toString() method 
* should return this formatted String value.
Write a test class to test the square:
• Construct an instance of the Square class.
• Assign a value to the square's side data member.
• Display the square's area and perimeter.
• Display the square on the screen. Hint: use the toString() method, but you 
* don't actually have to call it! Just use: System.out.println(square); where 
* "square" is the name of your Square variable. What happens, and why?
 */

public class Square {
    double side;
    
    public Square(){
        side = 5;
    }
    
    public void setSquare(double side){
        this.side = side;
    }
    
    public double getSquare(){
        return side;
    }
    
    public double calcArea(){
        return side * side;
    }
    
    public double calcPerimeter(){
        return 4 * side;
    }
    
    public String getDimensions(){
        
        return (int)(side*10)/10.0 + " x " + (int)(side*10)/10.0;
    }
    
    public String toString(){
        return getDimensions();
    }
}
