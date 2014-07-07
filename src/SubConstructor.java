/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class SubConstructor extends Constructor {

    protected String s;

    SubConstructor(int x) {
        super("label");
        x = this.x;
        System.out.println("[4] x = " + x);
    }

    public SubConstructor(String s) {
        this(12);
        this.s = s;
        x = 19;
        System.out.println("[5] x = " + x);
    }
    
    public static void main(String[] args) {
        
        SubSubConstructor ssc = new SubSubConstructor();
        System.out.println(ssc);
    }
}
