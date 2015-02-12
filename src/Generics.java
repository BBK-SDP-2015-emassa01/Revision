
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Generics <P> {
    
private List<P> array = null;

    public static void main(String [] args){
        //this one compiles
        List<Number> l=new ArrayList<>();
        l.add(new Integer(3));
        
//
//        //this does not compile
//        List<? extends Number> a=new ArrayList<>();
//        p.add(new Integer(3));
        
        //this does
        List<? super Number> p =new ArrayList<>();
        p.add(new Integer(3));
        
        
//        for (int a = 0; a <=2;a++){
//            array[a] = 3;
//        }
        
        String s = "Esha";
        System.out.println(s);
        System.out.println(s.substring(0, 1));
        System.out.println(s.substring(4-1));
        
        
//        List<T extends P> arrayList = Arrays.asList(array);
//        List myArrayList = arrayList; //WARNING may result in runtime downcast error?
//        ListIterator<T extends P> mylister = arrayList.listIterator();
//        
    }
    
    
    /* 
    This generic method tells you whether the elem is in the array, probably 
    doesnt need to extend comparable but what the hey.
    */
    public static <T extends Comparable<T>> T findThing(T elem, T[] array){
     if (array == null){
         return null;
     }   
     ArrayList<T> arrayList = new ArrayList(Arrays.asList(array)); 
    
     for (T i : arrayList){
     if (i.equals(elem)){
         return i;
     }
    }
     return null;
}
 
    /*
    Now write a method that finds the minimum elem in the array from some value to some value
    If you want to use this method with an arrayList, you could use
    
    List arrayList = Arrays.asList(array);
    ArrayList myArrayList = (ArrayList) arrayList;
    
    */
    public static <T extends Comparable< ? super T>> T findMinVal(T[] array, int begin, int end){
        if (array == null){
            return null;
        }
        
        T minVal = null;
        // need to check the Q semantics or state assumption in answer for the plus one's.
        List<T> sublist = Arrays.asList(array).subList(begin, end);
        //ArrayList<T> sublist = (ArrayList) arrayList.subList(begin,end);
        
        for (T i: sublist){
            if (minVal.compareTo(i)>0){
            minVal = i;
            }
    }
    return minVal;
}
    public static <T extends Comparable<? super T>> T goodFindMinVal(T[] arr, int begin, int end) {
	  	if (begin >= end) {
			return arr[begin];
		}
		T thing = goodFindMinVal(arr, begin+1, end);
		if(arr[begin].compareTo(thing) <= 0) {
			return arr[begin];
		} else {
			return thing;
		}
}
}

