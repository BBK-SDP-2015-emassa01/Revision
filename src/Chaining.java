/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Chaining {

    public static void main(String args[]) {
        try {
            C c = new C(); //1
            System.out.println(c.max(13, 29));
        } catch (RuntimeException rte) {
            System.out.println(rte);
        } finally {
            System.out.println("In finally of main");
        }
    }
}

class A {

    int max(int x, int y) { //23, 39
        try {
            if (x > y) {
                x++;
            } else {
                throw new Exception("Oh Dear!");//3
            }
            System.out.println("A::max value of x is " + x);
        } catch (Exception ex) {
            System.out.println("In exception " + ex.getMessage());
            System.out.println("x = " + x + " y = " + y);
            return y;
        } finally {
            System.out.println("A::max finally block");
            throw new IllegalArgumentException("A::max Finally x = " + x);
        }
    }
}

class C extends A {

    public int max(int x, int y) { //2
        return super.max(x + 10, y + 10);
    }
}


/*

In exception Oh Dear!
x = 23 y = 39
A::max finally block
"A::max Finally x = 23
In finally block of main

System.out.println("A::max value of x is " + 23);


*/