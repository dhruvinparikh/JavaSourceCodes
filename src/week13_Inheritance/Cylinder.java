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
public class Cylinder extends Circle {
    public Cylinder(){
    
}
    public double calcVolume()
    {
        return Math.PI * Math.pow(radius,3);
    }
}
