/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author imsil
 */
import java.io.*;
import java.net.*;

public class Reverse {
    public static void main(String[] args) throws Exception {

        /*if (args.length != 2) {
            System.err.println("Usage:  java Reverse "
                + "http://posttestserver.com/data/"
                + " string_to_reverse");
            System.exit(1);
        }*/

        String stringToReverse = URLEncoder.encode("http://posttestserver.com/data/", "UTF-8");

        URL url = new URL("http://posttestserver.com/data/");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        OutputStreamWriter out = new OutputStreamWriter(
                                         connection.getOutputStream());
        out.write("string=" + stringToReverse);
        out.close();

        BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    connection.getInputStream()));
        String decodedString;
        while ((decodedString = in.readLine()) != null) {
            System.out.println(decodedString);
        }
        in.close();
    }
}
