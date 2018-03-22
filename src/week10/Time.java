/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author imsil
 * Class: Time
Data Members: 
* + hours : int 
* + minutes : int 
* + seconds : int
Methods: 
* + Time() 
* + Time(hours : int, minutes : int, seconds : int) 
* + calcTotalSeconds() : int 
* + toString() : String
This class models a specific time stamp on a clock. 
* The calcTotalSeconds() method calculates and returns the total number of 
* seconds from midnight to the time represented by the time object 
* (use the normal calculation for total number of seconds: hours * 3600 + minutes * 60 + seconds). 
* The default constructor sets the time to midnight by setting each attribute to 0. 
* The toString() method returns a string representation of the time object in the form:
hh:mm:ss
(where hh, mm, and ss are the values of hours, minutes and seconds in the time 
* object, formatted to show exactly 2 digits)
 */
public class Time {
int hours;
int minutes;
int seconds;

public Time(){
}

public Time(int hours, int minutes, int seconds){
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
}

public int calcTotalSeconds(){
    return hours * 3600 + minutes * 60 + seconds;
}

public String getTime(){
    //return hours+":"+minutes+":"+seconds;
    return String.format("%02d:%02d:%02d",hours,minutes,seconds);
}

public String toString(){
    return getTime();
}

}
