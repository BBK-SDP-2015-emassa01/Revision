/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class SubSubConstructor extends SubConstructor {

    private String s;

    public SubSubConstructor() {
        super("item");
        s = super.s;
        x++;
        System.out.println("[6] [s = " + this.s + "] " + this);
    }

//    public String toString() {
//        return "******* " + super.toString();
//    }

    
}
