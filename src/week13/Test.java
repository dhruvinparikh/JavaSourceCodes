/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

/**
 *
 * @author imsil
 */
class Why {

public int x;

public int y;

public Why(int a, int b) {

x = a;

y = b;

}

}

public class Test {

public static void main(String[] a) {

Why w1 = new Why(1,2);

Why w2 = new Why(3,4);

System.out.println(w1.x+" "+w1.y);

}

}

 