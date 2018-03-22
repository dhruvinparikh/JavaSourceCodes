/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author imsil
 */
public class MethodEg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1. Technique
        displayMessage("Welcome to humber");
        
        //2.Technique
        String message = "I am in week 8 in this term already";
        
        displayMessage(message);
       
        String msg = "I am using different variable here";
        
        displayMessage(msg);
        
        int sum = add(5,7);
        
        int n1 = 10;
        int n2 = 34;
        //Display the answer in
        System.out.println(add(n1,n2));
    
        
        long n3 = 14;
        
        System.out.println(add(n1,n3));
    }
    
    public static void displayMessage(String message){
        System.out.println(message);
    }
    
    public static int add(long num1,int num2){
        long sum = num1 + num2;
        return (int)sum;
    }
    
    //Overoading
    public static int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    
    public static long add(long num1,long num2){
        return num1+num2;
    }
    
}
