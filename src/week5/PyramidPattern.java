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
public class PyramidPattern {

    public static void main(String[] args) {
        int b=0,v = 1;
        int row = 8;
        for(int i = 0 ; i < row ; i++){
            if(i == 0)
            {
             for(int j = (row - i)*4; j > i; j--){
                System.out.print(" ");
            }   
            }
            else{
            for(int j = (row - i)*4+v++ ; j > i; j--){
                System.out.print(" ");
            }
            }
            if(i == 0)
            {
                System.out.print((int)(Math.pow(2, i)));
            }
            else
            {
                b = i - 1;
                for(int k = 0 ; k <= 2*i ; k++){
                    if(k > i){
                        
                        System.out.printf("%d   ",(int)(Math.pow(2,b--)));
                    }
                    else{
                        
                        System.out.printf("%d   ",(int)(Math.pow(2,k)));
                    }
                }    
            }
            System.out.println();
        }
    }
}
