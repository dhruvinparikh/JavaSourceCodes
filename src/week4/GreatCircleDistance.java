package week4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imsil
 * (Geometry: great circle distance) The great circle distance is the distance between
two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
latitude and longitude of two points. The great circle distance between the two
points can be computed using the following formula:
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Write a program that prompts the user to enter the latitude and longitude of two
points on the earth in degrees and displays its great circle distance. The average
earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
using the Math.toRadians method since the Java trigonometric methods use
radians. The latitude and longitude degrees in the formula are for north and west.
Use negative to indicate south and east degrees. Here is a sample run:
Programming Exercises 151
Enter point 1 (latitude and longitude) in degrees: 39.55, -116.25
Enter point 2 (latitude and longitude) in degrees: 41.5, 87.37
The distance between the two points is 10691.79183231593 km
 * */
public class GreatCircleDistance {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1(latitude and longitude in degree)");
        double db1X1 = Math.toRadians(input.nextDouble());
        double db1Y1 = Math.toRadians(input.nextDouble());
        
        System.out.println("Enter point 2(latitude and longitude in degree)");
        double db1X2 = Math.toRadians(input.nextDouble());
        double db1Y2 = Math.toRadians(input.nextDouble());
        
        final double EARTH_RADIUS = 6371.01;
        
        double db1Distance = EARTH_RADIUS * Math.acos(Math.sin(db1X1) * Math.sin(db1X2) + Math.cos(db1X1) * Math.cos(db1X2) * Math.cos(db1Y1 - db1Y2));
        
        System.out.println("The distance between the two points is " + db1Distance + " km.");
        
        System.out.printf("The distance between the two points is %-10.1e km\n",db1Distance);
    }
    
}
