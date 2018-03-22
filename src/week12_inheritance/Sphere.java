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
public class Sphere extends Circle{
    
    public Sphere(){
        super(1);
    }
    
    public Sphere(double radius){
        this();
    }
    
    
    public double getArea(){
        return 4*super.getArea();
    }
    
    public double getVolume(){
        return (4.0/3) * super.getArea()*radius;
    }
    
}
