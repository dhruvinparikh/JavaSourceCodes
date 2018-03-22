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
public class TestSphere {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere();
        
        sphere1.setRadius(2.5);
        
        System.out.println(sphere1);
        System.out.println("Area of sphere is "+ sphere1.getArea());
        System.out.println("Volume of sphere is "+sphere1.getVolume());
        
        Sphere sphere2 = new Sphere();
        
        sphere2.setRadius(2.5);
        
        System.out.println(sphere2);
        System.out.println("Area of sphere is "+ sphere2.getArea());
        System.out.println("Volume of sphere is "+sphere2.getVolume());
        
        
        System.out.println("Area and volume of sphere1 and sphere2 respectively are equal "+sphere1.equals(sphere2));
    }
}
