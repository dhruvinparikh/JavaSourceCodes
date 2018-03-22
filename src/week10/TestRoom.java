/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author imsil
 */
public class TestRoom {
    public static void main(String[] args){
        Room room1 = new Room(10,15);   
//    room1.length = 10;
//    room1.width = 15;
        
        System.out.println("Area of room1 is " + room1.getArea());
        System.out.println(room1);
        System.out.println("Dimension of room1 is " + room1.getDimensions());
        
        
    }
}
