/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author venkatsa
 */
public class TestRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Room room1 = new Room();
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room");
          double width = scanner.nextDouble();
        room1.setLength(length);
        room1.setWidth(width);
        System.out.println("Area of room1 is:" +room1.getArea());
        System.out.println(room1);
         System.out.println("Dimensions of room1 is:" +room1.getDimensions());
         
         Room room2 = new Room(15,20);
         System.out.println("Room1 and Room 2 are equal is" + room1.equals(room2));
        
    }
    
}
