/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class linkedList {

    private int value = 1;
    private linkedList next = this;
    boolean head = true;

    public void add(linkedList another) {

        if (this.head == true) {
            another.value = this.value + 1;
            another.head = false;
            this.next = another;
            another.next = this.next;

        } else this.next.add(another);
    }
    
    
    

}
