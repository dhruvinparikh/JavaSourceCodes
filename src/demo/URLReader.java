/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.net.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLReader {

    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://www.ic.gc.ca/app/ccc/srch/nvgt.do;jsessionid=0001MzjhEtPsGqClKKFtyDHMELs:3PPLVSUJOA?lang=eng&prtl=1&sbPrtl=&estblmntNo=234567092703&profile=cmpltPrfl&profileId=1961&app=sold&searchNav=F");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine = "";
        /*while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }*/
        String s;
        while ((s = in.readLine()) != null) {
            inputLine += s;
        }
        in.close();

        //-company name
        Pattern p = Pattern.compile("<h2>");
        Matcher m = p.matcher(inputLine);
        int st = 0;
        int cnt = 0;
        while (m.find()) {
            cnt++;
            if (cnt == 2) {
                st = m.end();
                System.out.println(m.end());
                break;
            }
        }
        p = Pattern.compile("</h2>");
        m = p.matcher(inputLine);
        int e = 0;
        cnt = 0;
        while (m.find()) {
            cnt++;
            if (cnt == 6) {
                e = m.start();
                System.out.println(m.start());
                break;
            }
        }
        System.out.println(inputLine.substring(st,e).trim());
        String cName = inputLine.substring(st,e).trim();
        
        //--website
        p=Pattern.compile("\"Website URL\">");
        m=p.matcher(inputLine);
        st=0;
        cnt=0;
        if(m.find()){
            st=m.end();
        }
        e=0;
        cnt=0;
        p=Pattern.compile("</a></p>");
        m=p.matcher(inputLine);
        if(m.find()){
            e=m.start();
        }
        String web = inputLine.substring(st, e).trim();
        System.out.println(inputLine.substring(st, e).trim());
        
        //--email
        p=Pattern.compile("<p><a href=\"mailto:");
        m=p.matcher(inputLine);
        st=0;
        cnt=0;
        if(m.find()){
            st=m.end();
        }
        e=0;
        cnt=0;
        p=Pattern.compile("\"");
        m=p.matcher(inputLine);
        while(m.find()){
            if(m.start()>st){
            e=m.start();
            break;
            }
        }
        String email = inputLine.substring(st, e).trim();
        System.out.println(inputLine.substring(st, e).trim());
        
    }
}
