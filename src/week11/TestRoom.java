/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class TestRoom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Array of objects
        Room[] roomList = new Room[2];
        
        Room room1 = new Room(10,15);   

        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room");
        double width = scanner.nextDouble();
        
            room1.setLength(length);
            room1.setWidth(width);
            room1.setHeight(15);
        System.out.println("Length : "+room1.getLength());
        System.out.println("Area of room1 is " + room1.getArea());
        System.out.println(room1);
        System.out.println("Dimension of room1 is " + room1.getDimensions());
        System.out.println("Volume : " + room1.getVolume());
        
        Room room2 = new Room(15,20);
        
        System.out.println("Room1 and Room2 are equal is"+room2.equals(room1));
    
        //this
        roomList[0] = room1;
        roomList[1] = room2;
        ///or
        roomList[0] = new Room();
        roomList[1] = new Room();        
    }
}
