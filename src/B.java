/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */

public class B extends A2 {
int i;

public void incr(int d) {
if (d > 0) {
this.i += d;
super.incr(d / 2);
}
}
@Override
public String toString() {
return super.toString() + " B's i is: " + i;

}

}
