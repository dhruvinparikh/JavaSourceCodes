/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author imsil
 * 1. Write a program to compute the following series:
12...5231)(++++=iiim
and displays the following table:
i m(i)
1 0.3333
2 0.7333
.
.
.
19 8.7602
20 9.2480
 */
public class MTR1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int i = 1;
       float sum = 0;
       
       System.out.printf("%-5s%5s\n","i","m[i]");
       
       do{
       sum += (float)i/(2*i + 1);
       System.out.printf("%-5d%-10.4f\n",i,sum);
       i++;
       }while(i <= 20);
    }
    
}
