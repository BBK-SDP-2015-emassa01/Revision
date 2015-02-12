/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Derived extends Base {


    public void methodOne(int a) {
        super.methodOne();
        System.out.print("X");
    }

    public void methodOne(Integer a) {
        super.methodOne();
        System.out.print("C");
    }

    public void methodTwo() {
        super.methodTwo();
        System.out.print("D");
    }
    
    public static void main (String[] args){
        Integer a = new Integer(6);
        Base b = new Derived();
        b.methodOne(a);
    }
}
