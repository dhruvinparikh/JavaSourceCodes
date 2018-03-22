/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author imsil
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
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length=length;
    }
    
    public void setWidth(double width){
        this.width=width;
    }
    
    public double getWidth(){
         return width;
    }
    
    public void setHeight(double height){
        this.height=height;
    }
    
    public Room(int len){
        length = len;
        width = 5;
    }
    
    public double getVolume(){
        return length*width*height;
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
    
    public boolean equals(Room r2){
        return length == r2.getLength() && width == r2.getWidth();
    }
}
