package week4;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author imsil Write a program that prompts the user to enter a year and the
 * first three letters of a month name (with the first letter in uppercase) and
 * a day of the month. It should validate and displays if the year is a leap
 * year, the number of days in the month and if the date entered is a valid
 * date. Display appropriate error information if any information entered is
 * invalid. Here is a sample run: Enter a year: 2001 Enter a month: Jan Enter
 * day: 21 2001 is not a leap year Jan 2001 has 31 days Jan 21 2001 is a valid
 * date
 */
public class LeapYearAssignmentLab3 {

    public static void main(String[] args) {
        //Console Input object declaration
        Scanner objScanner = new Scanner(System.in);
        int intDays;

        //Input from the user
        System.out.print("Enter a year:");
        int intYear = objScanner.nextInt();

        objScanner = new Scanner(System.in);
        System.out.print("\nEnter a first three letters of month with first uppercase letter :");
        String strMonth = objScanner.nextLine();

        System.out.print("\nEnter day:");
        int intDay = objScanner.nextInt();

        //Validating Leap Year
        boolean leapYear = (intYear % 4 == 0 && intYear % 100 != 0) || intYear % 400 == 0;

        if (leapYear) {
            System.out.printf("%d is a leap year.\n", intYear);
        } else {
            System.out.printf("%d is not a leap year.\n", intYear);
        }

        //Validating Month
        boolean monthValidate = strMonth.equals("Jan") || strMonth.equals("Feb") || strMonth.equals("Mar") || strMonth.equals("Apr")
                || strMonth.equals("May") || strMonth.equals("Jun") || strMonth.equals("Jul") || strMonth.equals("Aug")
                || strMonth.equals("Sep") || strMonth.equals("Oct") || strMonth.equals("Nov") || strMonth.equals("Dec");
        
        //Validating Date
        boolean dayValidate = intDay > 0 && intDay < 32;

        if (monthValidate && dayValidate) {

            switch (strMonth) {
                case "Jan":
                case "Mar":
                case "May":
                case "Jul":
                case "Aug":
                case "Oct":
                case "Dec":
                    intDays = 31;
                    System.out.println(strMonth + " " + intYear + " has " + intDays + " days.");
                    System.out.println(strMonth + " " + intDay + " " + intYear + " is a valid date.");
                    break;

                case "Apr":
                case "Jun":
                case "Sep":
                case "Nov":
                    intDays = 30;
                    if(intDay < 31)
                    {
                    System.out.println(strMonth + " " + intYear + " has " + intDays + " days.");
                    System.out.println(strMonth + " " + intDay + " " + intYear + " is a valid date.");
                    }
                    else
                    {
                        System.out.println(strMonth + " " + intYear + " has " + intDays + " days.");
                    System.out.println(strMonth + " " + intDay + " " + intYear + " is not a valid date.");
                    }
                    break;

                case "Feb":
                    intDays = leapYear?29:28;
                    if(intDays == 29)
                    {
                        if(intDay > 29)
                        {
                            System.out.println(strMonth + " " + intYear + " has " + intDays + " days.");
                    System.out.println(strMonth + " " + intDay + " " + intYear + " is not a valid date.");
                        }
                        else
                        {
                            System.out.println(strMonth + " " + intYear + " has " + intDays + " days.");
                    System.out.println(strMonth + " " + intDay + " " + intYear + " is a valid date.");
                        }
                    }
                    else if(intDays == 28)
                    {
                        if(intDay > 28)
                        {
                            System.out.println(strMonth + " " + intYear + " has " + intDays + " days.");
                    System.out.println(strMonth + " " + intDay + " " + intYear + " is not a valid date.");
                        }
                        else
                        {
                            System.out.println(strMonth + " " + intYear + " has " + intDays + " days.");
                    System.out.println(strMonth + " " + intDay + " " + intYear + " is a valid date.");
                        }
                    }
                    break;
            }
        } else {
            if (!monthValidate) {
                System.out.println("Error:Incorrect month name or format");
            } else if (!dayValidate) {
                System.out.println("Error:Day out of range");
            }
        }

    }
}
