/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13_Inheritance;

import java.util.Objects;

/**
 *
 * @author venkatsa
 */
public class Shape {

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", intSides=" + intSides + ", filled=" + filled + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.color);
        hash = 23 * hash + this.intSides;
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
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIntSides() {
        return intSides;
    }

    public void setIntSides(int intSides) {
        this.intSides = intSides;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, int intSides) {
        this.color = color;
        this.intSides = intSides;
    }
    private String color;
    private int intSides;
    private boolean filled;
    
    public Shape()
    {
        System.out.println("In Shape constructor");
        color = "black";
        filled = false;
        intSides = 2;
    
    }
     public Shape(String color)
     {
         System.out.println("In Shape parameterized constructor");
         this.color = color;     
     }
     public Shape(String color , boolean filled)
     {
         this.color = color;
         this.filled = filled;
     }
     

}
