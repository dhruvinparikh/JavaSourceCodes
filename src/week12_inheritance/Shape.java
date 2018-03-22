/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_inheritance;

import java.util.Objects;

/**
 *
 * @author imsil
 */
public class Shape {
    private String color;
    private  int intSides;
    private boolean filled;
    
    public Shape(){
        System.out.println("In shape construcor");
        color = "black";
        filled = false;
        intSides = 2;
    }
    
    public Shape(String color){
        System.out.println("In shape paramaterised constructor");
        this.color=color;
    }

    public Shape(String color,boolean filled){
        
        this.color=color;
        this.filled=filled;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.color);
        hash = 31 * hash + this.intSides;
        hash = 31 * hash + (this.filled ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Shape other = (Shape) obj;
        if (this.intSides != other.intSides) {
            return false;
        }
        if (this.filled != other.filled) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    public String getColor() {
        return color;
    }

    public int getIntSides() {
        return intSides;
    }

    public boolean isFilled() {
        return filled;
    }
    
    
}
