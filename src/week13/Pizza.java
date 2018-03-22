/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

/**
 *
 * @author imsil
 */
public class Pizza {
private String size;
private int cheeseToppings;
private int pepperoniToppings;
private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

public Pizza() {
        this.size = "small";
        this.cheeseToppings = 0;
        this.pepperoniToppings = 0;
        this.hamToppings=0;
    }


    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the cheeseToppings
     */
    public int getCheeseToppings() {
        return cheeseToppings;
    }

    /**
     * @param cheeseToppings the cheeseToppings to set
     */
    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    /**
     * @return the pepperoniToppings
     */
    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    /**
     * @param pepperoniToppings the pepperoniToppings to set
     */
    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public double calcCost(){
double cost=0;
        switch(getSize()){
            case "small":
                cost =  10+
                        2*getCheeseToppings()+
                        2*getPepperoniToppings()+
                        2*getHamToppings();
                break;
            case "medium":
                cost =  12+
                        2*getCheeseToppings()+
                        2*getPepperoniToppings()+
                        2*getHamToppings();
                break;
            case "large":
                cost =  14+
                        2*getCheeseToppings()+
                        2*getPepperoniToppings()+
                        2*getHamToppings();
                break;
        }
        return cost;
    }

    public String getDescription(){
        return "Size : " + 
                size + 
                "\nCheese Toppings : " + 
                cheeseToppings + 
                "\nPepperoni Toppings : " + 
                pepperoniToppings + 
                "\nHam Toppings : " + 
                hamToppings + 
                "\nCost : $" + 
                calcCost() + 
                "\n";
    }
    
    /**
     * @return the hamToppings
     */
    public int getHamToppings() {
        return hamToppings;
    }

    /**
     * @param hamToppings the hamToppings to set
     */
    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

}
