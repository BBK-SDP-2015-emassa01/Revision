/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Test {

//    public static void main(String[] args) {
//        Child c = new Child();
//        c.eat(); //GETS HERE CALLS EAT FROM PARENT
//    }
    public static void main(String[] args) {
        A2 a = new B(); //1
        a.incr(10); //2
        System.out.println(a);
    }

}
