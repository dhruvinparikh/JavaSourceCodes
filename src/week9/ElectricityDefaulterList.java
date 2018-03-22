/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.util.*;

/**
 *
 * @author imsil This program lists the defaulter electricity consumer
 * /*Calendar calendar = Calendar.getInstance(); int day =
 * calendar.get(Calendar.DATE); int month = calendar.get(Calendar.MONTH); int
 * year = calendar.get(Calendar.YEAR); Date date = new Date(year,month,day);
 * Date date2 = new Date(2017,03,25); System.out.println(day+" "+(month+1)+"
 * "+year+" " + date2.after(date));
 */
public class ElectricityDefaulterList {

    public static void main(String[] args) {

        String[] consumerID = new String[10];
        String[] consumerFirst = new String[10];
        String[] consumerLast = new String[10];
        String[] consumerAddress = new String[10];
        double[] billAmount = new double[10];
        int[] dueDateYear = new int[10];
        int[] dueDateMonth = new int[10];
        int[] dueDateDay = new int[10];

        consumerID[0] = "16543038144";
        consumerFirst[0] = "MURJIBHAI";
        consumerLast[0] = "PATEL";
        consumerAddress[0] = "BRAMPTON";
        billAmount[0] = 3856.87;
        dueDateYear[0] = 2017;
        dueDateMonth[0] = 03;
        dueDateDay[0] = 16;

        consumerID[1] = "16543038152";
        consumerFirst[1] = "SUBHASCHANDRA";
        consumerLast[1] = "SHANKARLAL";
        consumerAddress[1] = "SCARBOROUGH";
        billAmount[1] = 2807.6;
        dueDateYear[1] = 2017;
        dueDateMonth[1] = 03;
        dueDateDay[1] = 17;

        consumerID[2] = "16543038160";
        consumerFirst[2] = "ANKIT";
        consumerLast[2] = "SHAH";
        consumerAddress[2] = "BRAMPTON";
        billAmount[2] = 2290.65;
        dueDateYear[2] = 2017;
        dueDateMonth[2] = 03;
        dueDateDay[2] = 18;

        consumerID[3] = "16543038179";
        consumerFirst[3] = "CHANDRAKANT";
        consumerLast[3] = "PATI";
        consumerAddress[3] = "MISSISUAGA";
        billAmount[3] = 948.56;
        dueDateYear[3] = 2017;
        dueDateMonth[3] = 03;
        dueDateDay[3] = 19;

        consumerID[4] = "16543038187";
        consumerFirst[4] = "MAHENDRABHAI";
        consumerLast[4] = "SHAH";
        consumerAddress[4] = "SCARBOROUGH";
        billAmount[4] = 70.01;
        dueDateYear[4] = 2017;
        dueDateMonth[4] = 03;
        dueDateDay[4] = 20;

        consumerID[5] = "16543038195";
        consumerFirst[5] = "JYOTIBEN";
        consumerLast[5] = "MAHETA";
        consumerAddress[5] = "BRAMPTON";
        billAmount[5] = 4265.8;
        dueDateYear[5] = 2017;
        dueDateMonth[5] = 03;
        dueDateDay[5] = 21;

        consumerID[6] = "16543038209";
        consumerFirst[6] = "DINESHBHAI";
        consumerLast[6] = "PATEL";
        consumerAddress[6] = "BRAMPTON";
        billAmount[6] = 5671.94;
        dueDateYear[6] = 2017;
        dueDateMonth[6] = 03;
        dueDateDay[6] = 22;

        consumerID[7] = "16543038217";
        consumerFirst[7] = "ASHOKBHAI";
        consumerLast[7] = "PATEL";
        consumerAddress[7] = "SCARBOROUGH";
        billAmount[7] = 5033.44;
        dueDateYear[7] = 2017;
        dueDateMonth[7] = 03;
        dueDateDay[7] = 23;

        consumerID[8] = "16543038225";
        consumerFirst[8] = "BELABEN";
        consumerLast[8] = "TRIVEDI";
        consumerAddress[8] = "BRAMPTON";
        billAmount[8] = 5849.78;
        dueDateYear[8] = 2017;
        dueDateMonth[8] = 03;
        dueDateDay[8] = 24;

        consumerID[9] = "16543038233";
        consumerFirst[9] = "MANISHBHAI";
        consumerLast[9] = "TRIVEDI";
        consumerAddress[9] = "MISSISUAGA";
        billAmount[9] = 1313.61;
        dueDateYear[9] = 2017;
        dueDateMonth[9] = 03;
        dueDateDay[9] = 25;

        consumerID[0] = "16543037105";
        consumerFirst[0] = "PRITESH";
        consumerLast[0] = "PURANI";
        consumerAddress[0] = "BRAMPTON";
        billAmount[0] = 2148.78;
        dueDateYear[0] = 2017;
        dueDateMonth[0] = 03;
        dueDateDay[0] = 26;

        
        
        
        generateDefaulterList(consumerID,consumerFirst,consumerLast,consumerAddress,billAmount,dueDateYear,dueDateMonth,dueDateDay);
    }
    
    public static void generateDefaulterList(String[] consumerID, String[] consumerFirst, String[] consumerLast, String[] consumerAddress, double[] billAmount,int[] dueDateYear,int[] dueDateMonth,int[] dueDateDay){
        
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        
        String srCol = "Sr.No.";
        String col1 = "Consumer_ID";
        String col2 = "First Name";
        String col3 = "Last Name";
        String col4 = "City";
        String col5 = "Bill Amount";
        String col6 = "Due Date";
        
        Scanner objScanner = new Scanner(System.in);
        
        switch(chrChoice()){
            case 'C':
            case 'c':
                System.out.println("Enter date(YYYY/MM/DD):");
                String strDate = objScanner.nextLine();
                year = Integer.parseInt(strDate.substring(0,4));
                month = Integer.parseInt(strDate.substring(5, 7));
                day = Integer.parseInt(strDate.substring(8));
                month -= 1;
        }
        
        Date date = new Date(year, month, day);
        
        System.out.println("List of defaulters ");
        
        System.out.printf("%8s%14s%16s%15s%10s%21s%13s\n",srCol,col1,col2,col3,col4,col5,col6);
        
        int cnt = 1;
        for(int i = 0 ; i < 10 ; i++){
            Date aDate = new Date(dueDateYear[i],dueDateMonth[i]-1,dueDateDay[i]);
            
            if(aDate.before(date)){
                System.out.printf("%5d%17s%6s%-16s%-15s%-14s%-13.2f%3s",cnt,consumerID[i]," ",consumerFirst[i],consumerLast[i],consumerAddress[i],billAmount[i]," ");
                System.out.println(dueDateYear[i]+"/"+dueDateMonth[i]+"/"+dueDateDay[i]);
                cnt++;
            }
        }    
    }
    
    public static char chrChoice(){
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("Press C for customised defaulter list generation, any other key for system default");
        char chrChoice = objScanner.next().charAt(0);
        objScanner.nextLine();
        return chrChoice;
    }
}
