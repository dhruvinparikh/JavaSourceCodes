/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class TwoDArray {
    public static void main(String[] args) {
        int[][] number = new int[3][2];
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        
        for(int row = 0 ; row < number.length ;row++){
            for(int col = 0 ; col < number[row].length ; col++){
            System.out.println("Enter the number in row "+(row+1)+" and column " + (col+1));
  number[row][col] = scanner.nextInt();
            }
        }
        
        //Print 2D array
        for(int row = 0 ; row < number.length ; row++){
            for(int col = 0 ; col < number[row].length ; col++){
                System.out.print(number[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum : " + findSum(number));
        int[] sum = new int[number.length];
        sum = findSumByRow(number);
        for(int i = 0 ;i < number.length ; i++){
            System.out.println("Sum of row " +(i+1) + " is "+sum[i]);
        }
        
        System.out.println(findGreater(findSumByRow(number)) + " row has largest sum");
        
        sum = new int[number[0].length];
        sum = findSumByCol(number);
        for(int i = 0 ;i < number[0].length ; i++){
            System.out.println("Sum of col " +(i+1) + " is "+sum[i]);
        }
    }
    //find sum of all elements
    public static int findSum(int[][] n){
        int sum = 0;
        
        for(int row = 0 ; row < n.length ; row++){
            for(int col = 0 ; col < n[row].length ; col++){
                sum += n[row][col];
            }
        }
        return sum;
    }
    //find sum of elements by row
    public static int[] findSumByRow(int[][] n){
        int[] sum = new int[n.length];
        
        for(int row = 0 ; row < n.length ; row++){
            sum[row] = 0;
            for(int col = 0 ; col < n[row].length ; col++){
                sum[row] += n[row][col];
            }
        }        
        return sum;
    }
    //sum of elements by Col
    public static int[] findSumByCol(int[][] n){
        int[] sum = new int[n[0].length];
        
        for(int col = 0 ; col < n[0].length ; col++){
            sum[col] = 0;
            for(int row = 0 ; row < n.length ;row++){
                sum[col]+=n[row][col];
            }
        }
        return sum;
    }
    
    //find the row having largest sum
    public static int findGreater(int[] sum){
        int max = sum[0];
        int index = 0;
        
        for(int i = 1 ; i < sum.length ; i++){
            if(sum[i] > max){
                index = i;
            }
        }
        return index+1;
    }
}
