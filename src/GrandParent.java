/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public abstract class GrandParent {

    private final static int HowMuch = 100;

    public abstract boolean good();

    public static int getMore() {
        return HowMuch;
    }

    public void eat() {
        if (good())// 3. NEEDS TO CALL GOOD IN PARENT
        {
            System.out.println("Good!");
        } else {
            System.out.println("Bad!"); //7 PRINT Good!
        }
    }
}
