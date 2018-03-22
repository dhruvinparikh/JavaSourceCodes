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
public class TriangularPatternUsingNestedLoops {
    public static void main(String[] args){
        for(int i = 1 ; i < 8 ; i++){
            for(int j = 1 ; j < i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
