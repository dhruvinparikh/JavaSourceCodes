/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author imsil 1.	Write a method that displays an n by n matrix using the
 * following header: public static void printMatrix(int n) Each element is 0 or
 * 1, which is generated randomly.
 *
 * Sample run: Enter n: 3 0 1 0 1 1 1 1 0 1
 *
 */
public class Matrix_nXn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printMatrix(8);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(((Math.random() > 0.5) ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}
