/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**. Write a class called Room that models a simple, rectangular-shaped room. A room object has:
•	Data:
o	length of room
o	width of room
•	Methods:
o	getDimensions(): returns a string that contains the dimensions 
* in the form The room is L x W (where L is the length and W is the width)
o	getArea(): calculates and returns the room's area
Write a test program that creates a Room object, then assigns a length and width. Show the room's dimensions and area on the screen.

 *
 * @author venkatsa
 */
public class Room {
    private double length;
    private double width;
    
    public Room()
    {
        length = 5;
        width = 10;
    }
    
    public Room(double length)
    {
        this.length = length;
        width = 5;
    }
     public Room(int length,int width)
    {
        this.length = length;
        this.width = width;
    }
     
     public double getLength()
     {
         return length;
     }
     public double getWidth()
     {
         return width;
     }
       public void setLength(double length)
     {
         if(length > 0)
            this.length = length;
     }
     public void setWidth(double width)
     {
         if(width > 0)
            this.width = width;
     }
    public double getArea()
    {
        return length * width;
    }
    
    public String getDimensions()
    {
        return "The room is " + length + " * " + width ;
    }
    
    public String toString(){
        return getDimensions();
    }
    public boolean equals(Room r2)
    {
        return length == r2.getLength() && width == r2.getWidth();
    }
}
