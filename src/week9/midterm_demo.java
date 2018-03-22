/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author imsil
 */
class midterm_demo {

    public static void main(String[] args) {
        A a = new A("Parikh\n");
        a.print();
    }
}

class A {

    String s;

    public A() {
        s = "Dhruvin\n";
    }

    A(String newS) {
        s = newS;
    }

    public void print() {
        System.out.print(s);
    }
}
