package demo;

/**
 *
 * @author PrinceKler
 */
public class Fraction {

    private int numerator,denominator;

public Fraction()
{
numerator=1;denominator=1;
}
public Fraction(int numerator)
{
this.numerator=numerator;
}
public Fraction(int numerator,int denominator)
{
this.numerator=numerator;
this.denominator=denominator;
}
public int getNumerator()
{
    return numerator;
}
public void setNumerator(int n)
{
    numerator=n;
}
public int getDenominator()
{
    return denominator;
}
public void setDenominator(int d)
{
    denominator=d;
}
public double getValue(){
    double fraction=numerator/denominator;
    return fraction;
}
public String toString()
{
   return String.format("%d/%d",numerator,denominator);
      
}
public boolean equals(Fraction fract)
{
    if(getValue() == fract.getValue()){
        return true;}
        else
        return false;
    }
    
}