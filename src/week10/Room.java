/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author imsil
 * Write a class called Room that models a simple, rectangular-shaped room. 
 * A room object has:
• Data:
o length of room
o width of room
• Methods:
o getDimensions(): returns a string that contains the dimensions in the form 
* The room is L x W (where L is the length and W is the width)
o getArea(): calculates and returns the room's area
Write a test program that creates a Room object, then assigns a length and width. 
* Show the room's dimensions and area on the screen.
 */
public class Room {
    double length;
    double width;
    double height;
    
    public Room(){
        length = 5;
        width = 10;
        height = 15;
    }
    
    public Room(int len){
        length = len;
        width = 5;
    }
    
    public Room(int len,int wid){
        length = len;
        width = wid;
    }
    
    public double getArea(){
        return length * width;
    }
    
    public String getDimensions(){
        return "The room is " + length + " * " + width;
    }
    
    public String toString(){
        return getDimensions();
    }
}
