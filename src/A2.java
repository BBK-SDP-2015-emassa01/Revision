/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class A2 {
    int i;
public void incr(int d) {
if (d > 0) {
this.i += d;
this.incr(d - 1);
}
}
public String toString() {
return "A's i is: " + i;
}
    
}
