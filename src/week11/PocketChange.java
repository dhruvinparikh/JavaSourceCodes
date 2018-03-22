/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author imsil
 * pennies - 1 cent
 * nickel - 5 cents
 * dimes - 10 cents
 * quarter - 25 cents
 * loonies - 1$
 * toonies - 2$
 */
public class PocketChange {
    private int toonies,loonies,quarters;
    private int dimes,nickels,pennies;
    
    PocketChange(){
        toonies=0;
        loonies=0;
        quarters=0;
        dimes=0;
        nickels=0;
        pennies=0;
    }
    
    public void PocketChange(int toonies,int loonies, int quarters, int dimes, int nickels, int pennies){
        this.toonies=toonies;
        this.loonies=loonies;
        this.quarters=quarters;
        this.dimes=dimes;
        this.nickels=nickels;
        this.pennies=pennies;
    }
    
    public void setToonies(int toonies){
        if(toonies>0)
        this.toonies=toonies;
    }
    
    public int getToonies(){
        return toonies;
    }
    
    public void setLoonies(int loonies){
        if(loonies>0)
        this.loonies=loonies;
    }
    
    public int getLoonies(){
        return loonies;
    }
    
    public void setQuarters(int quarters){
        if(quarters>0)
        this.quarters=quarters;
    }
    
    public int getQuarters(){
        return quarters;
    }
    
    public void setDimes(int dimes){
        if(dimes>0)
        this.dimes=dimes;
    }
    
    public int getDimes(){
        return dimes;
    }
    
    public void setNickels(int nickels){
        if(nickels>0)
        this.nickels=nickels;
    }
    
    public int getNickels(){
        return nickels;
    }
    
    public void setPennies(int pennies){
        if(pennies>0)
        this.pennies=pennies;
    }
    
    public int getPennies(){
        return pennies;
    }
    
    public double calcAmount(){
        return (double)(int)((((double)pennies/100) + (((double)nickels*5)/100) + (((double)dimes*10)/100) + (((double)quarters*25)/100) + loonies + toonies*2)*100)/100;
    }
    
    public String toString(){
        return String.format("Toonies:\t%d\nLoonies:\t%d\nQuarters:\t%d\nDimes:   \t%d\nNickels:\t%d\nPennies:\t%d\n",toonies,loonies,quarters,dimes,nickels,pennies);
    }
}
