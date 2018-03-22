/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class TestTime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
Time time1 = new Time();
   
        System.out.println("Enter time : ");
        String usrTime = scanner.nextLine();
        
        time1.setHours(Integer.parseInt(usrTime.substring(0,usrTime.indexOf(':'))));
        time1.setMinutes(Integer.parseInt(usrTime.substring(usrTime.indexOf(':')+1,usrTime.lastIndexOf(':'))));
        time1.setSeconds(Integer.parseInt(usrTime.substring(usrTime.lastIndexOf(':')+1)));
        
        System.out.println(time1.getHours()+":"+time1.getMinutes()+":"+time1.getSeconds());
        
        System.out.println(time1);
        System.out.println("Total time1 in seconds is " + time1.calcTotalSeconds());
        
        Time time2 = new Time();
   
        System.out.println("Enter time : ");
        usrTime = scanner.nextLine();
        
        time2.setHours(Integer.parseInt(usrTime.substring(0,usrTime.indexOf(':'))));
        time2.setMinutes(Integer.parseInt(usrTime.substring(usrTime.indexOf(':')+1,usrTime.lastIndexOf(':'))));
        time2.setSeconds(Integer.parseInt(usrTime.substring(usrTime.lastIndexOf(':')+1)));
        
        System.out.println(time2.getHours()+":"+time2.getMinutes()+":"+time2.getSeconds());
        
        System.out.println(time2);
        System.out.println("Total time1 in seconds is " + time2.calcTotalSeconds());
        
        System.out.println("Time1 and Time2 are same is "+time1.equals(time2));
        
        Time[] timeList = new Time[5];
        
        timeList[0] = new Time(10,11,12);
        timeList[1] = new Time(10,11,13);
        timeList[2] = new Time(10,11,12);
        timeList[3] = new Time(10,11,13);
        timeList[4] = new Time(10,11,12);
        
        for(int i = 0 ;i<4;i++){
            
            for(int j=i+1 ; j<5 ; j++){
            if(timeList[i].equals(timeList[j]))
            System.out.printf("Time[%d] and Time[%d] are same\n",i,j);
            }
        }
    }
}
