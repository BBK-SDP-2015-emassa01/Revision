/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Constructor {

    private String s;

    protected int x;

    public Constructor() {
        System.out.println("[1]" + this);
    }

    public Constructor(String s) {
        this();
        this.s = s;
        System.out.println("[2]" + this);
    }

    public String toString() {
        return " s = " + this.s + " x = " + this.x;
    }

}
