/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Bases {

    public void methodOne() {
        System.out.println("A");
        methodTwo();
    }

    public void methodOne(int a) {
        System.out.println("W");
        methodTwo();
    }

    public void methodTwo() {
        System.out.print("B");
    }

}
