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
public class Cylinder extends Circle{
    public Cylinder(){
        
    }
    public double calcVolume(){
        return super.getArea()*radius;
    }
}
