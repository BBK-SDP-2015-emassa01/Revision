

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Map<P> implements Iterable<P> {
    private Set<P> associates = new HashSet<>();
    
    public static void main(String[] args) {
    }

    @Override
    public Iterator<P> iterator() {
       return associates.iterator();
    }
    
    public void enroll(P c){
        associates.add(c);
    }
    
    public void withdraw(P c){
        associates.remove(c);
    }

    public <T extends P> void merge(Map<T> other){
        for(T i: other) {
            other.withdraw(i);
            this.enroll(i);
        }
}
    
}
