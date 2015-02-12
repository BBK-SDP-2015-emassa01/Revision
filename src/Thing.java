/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Thing extends Bases {

    public Thing() {
        System.out.println("Thing constructor");
    }
    boolean YES;

    public Thing(boolean b) {
        YES = !b;
    }

    public void myMethod() {
        System.out.println("Thing::myMethod");
        if (YES) {
            anotherMethod(this);
        } else {
            //anotherMethod();
        }
    }

    public void aMethod() {
        System.out.println("Thing::aMethod");
        //super.anotherMethod();
        myMethod();
    }

    public void anotherMethod(Object o) {
        System.out.println("Thing::anotherMethod");
       // ((Base) o).anotherMethod();
    }
}
