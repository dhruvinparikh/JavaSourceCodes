/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author imsil
 */
public class Fraction {
    int numerator;
    int denominator;
    
    Fraction(){
        numerator=1;
        denominator=1;
    }
    
    Fraction(int numerator){
        if(numerator>0)
        this.numerator=numerator;
    }
    
    Fraction(int numerator, int denominator){
        if(numerator>0)
            this.numerator=numerator;
        if(denominator>0)
            this.denominator=denominator;
    }
    
    public void setNumerator(int n){
        if(n>0)
        numerator=n;
    }
    
    public void setDenominator(int d){
        if(d>0)
        denominator=d;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    public double getValue(){
        return (double)numerator/(double)denominator;
    }
    
    public String toString(){
        return String.format("Fraction:\t%d/%d\n",numerator,denominator);
    }
    
    public boolean equals(Fraction fraction){
        return fraction.getValue()== getValue();
    }
}
