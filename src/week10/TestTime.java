/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author imsil
 */
public class TestTime {
    public static void main(String[] args){
Time time1 = new Time();
   
        System.out.println(time1);
        System.out.println("Total time1 in seconds is " + time1.calcTotalSeconds());
        
        Time time2 = new Time(5,45,7);
        System.out.println();
System.out.println(time2);
        System.out.println("Total time2 in seconds is " + time2.calcTotalSeconds());
        
        Time time3 = new Time();
        System.out.println();
        
        time3.hours = 10;
        time3.minutes = 10;
        time3.seconds = 15;
System.out.println(time3);
        System.out.println("Total time3 in seconds is " + time3.calcTotalSeconds());
    }

}
