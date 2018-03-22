/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pinesh
 */

class MyObject implements Comparable<MyObject> {

    private Date dateTime;
    double billAmount;

    public MyObject(Date date, double amount) {
        dateTime = date;
        billAmount = amount;

    }

    public double getBillAmount() {
        return billAmount;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date datetime) {
        this.dateTime = datetime;
    }

    @Override
    public int compareTo(MyObject o) {
        if (getDateTime() == null || o.getDateTime() == null) {
            return 0;
        }
        return getDateTime().compareTo(o.getDateTime());
    }
}

public class TestMyObject {

    public static void main(String[] args) throws ParseException {
        ArrayList<MyObject> list = new ArrayList<MyObject>();

        DateFormat format = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH);

        String string = "21/02/2013";
        Date date = format.parse(string);
        list.add(new MyObject(date, 100));

        string = "29/01/2013";
        date = format.parse(string);
        list.add(new MyObject(date, 101));

        string = "23/04/2015";
        date = format.parse(string);
        list.add(new MyObject(date, 102));

        System.out.println(list.get(0).getDateTime().compareTo(list.get(1).getDateTime()));
        
        System.out.println("-----After-----");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getDateTime()+" "+list.get(i).billAmount);
        }
        System.out.println("-----After-----");

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getDateTime()+" "+list.get(i).billAmount);
        }
    }
}
