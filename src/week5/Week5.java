/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
int i = 0;
 do {
 System.out.println(i + 4);
 i++;
 }
 while (i < 10);

        int b = 1,c,intDigits=1,sum=0,d,a;
 
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println();
            System.out.print("Press N to exit, any other key to continue:");
            char chrChoice = input.next().charAt(0);
            
            input = new Scanner(System.in);
if(chrChoice == 'N' || chrChoice == 'n'){
    break;
}
                
        while(b <= 999){
            c = b;
            while(c/10 != 0){
                intDigits++;
                c /= 10;
            }
            sum = 0;
            d = b;
            while(d > 0){
                a = d%10;
                sum += (int)(Math.pow(a,intDigits));
                d /= 10;
            }
            
            if(sum == b)
            {
                System.out.print(b + " ");
            }
            b++;
            intDigits = 1;
        }
        }
        
        
       System.out.println('4');
        char x = 'a';
        char y = 'c';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);
       
        System.out.printf("%6b\n", (1 > 2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%-6b%s\n", (1 > 2), "Java");
        System.out.printf("%6b%-8s\n", (1 > 2), "Java");

        String number = "+919825142922";
        int len = number.length();
        System.out.println("x = " + len);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Range1: ");
        char intRange1 = Character.toLowerCase(scanner.next().charAt(0));

        System.out.println("Range2: ");
        char intRange2 = Character.toLowerCase(scanner.next().charAt(0));

        char intNumber = (char) ((int) (intRange1) + (int) ((Math.random() * (int) (intRange2 - intRange1))));

        System.out.println("Number : " + intNumber);

    }

}
