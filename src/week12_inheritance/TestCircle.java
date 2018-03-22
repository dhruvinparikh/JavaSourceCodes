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
public class TestCircle {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        
        Shape c1 = new Cylinder();
        Shape sh = new Sphere();
        
        displayShapeInfo(c1);
        displayShapeInfo(sh);
        displayShapeInfo(c);
    }
    
    public static void displayShapeInfo(Shape obj) {
        if(obj instanceof Cylinder){
            System.out.println(((Cylinder)obj).calcVolume());
    }
        else if(obj instanceof Sphere){
                System.out.println(obj);
                }
        else if(obj instanceof Circle){
            System.out.println(((Circle) obj).getArea());
        }
    }
}
