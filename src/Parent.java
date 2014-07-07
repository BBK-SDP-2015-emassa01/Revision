/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Parent extends GrandParent {

    @Override
    public boolean good() {
        System.out.println(getAge()); //4 PRINT 21
        System.out.println(getMore());//5. PRINT ...?
        return getAge() < getMore();//6. True
    }

    public int getAge() {
        return 42;
    }

    @Override
    public void eat() {
        super.eat();//2. CALLS SUPER EAT 
        System.out.println("Ahh.........!");//8 PRINT AHHHH…!
    }
}
