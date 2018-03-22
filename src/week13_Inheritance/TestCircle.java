/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13_Inheritance;

/**
 *
 * @author venkatsa
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        
        Circle c1 = new Cylinder();
        
        Cylinder cy = new Cylinder();
        
        displayShapeInfo(c1);
        displayShapeInfo(cy);
        
      
    }
    
    public static void displayShapeInfo(Circle obj)
    {
        if(obj instanceof Cylinder)
        {
            System.out.println(((Cylinder)obj).calcVolume());
        }
        else if(obj instanceof Sphere)
        {
           System.out.println(obj);     
        }else if(obj instanceof Circle)
        {
            System.out.println(obj.getArea());
        }
    }
}
