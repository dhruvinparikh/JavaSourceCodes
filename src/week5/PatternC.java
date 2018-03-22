/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author imsil
 */
public class PatternC {
    public static void main(String[] args){
        for(int i = 1 ; i < 7; i++){
            for(int b = 6 ; b > 0 ;  b--)
            {
                if(b > i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(b);
                }
            }
            
            System.out.println();    
        }
    }
}
            
                
            