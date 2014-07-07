/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   import java.lang.Comparable;
/**
 *
 * @author Esha
 */
public class MontyGenerics {




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

	public static <T extends Comparable<T>> T badFindMinVal(T[] arr, int begin, int end) {
	  	if (begin >= end) {
			return arr[begin];
		}
		T thing = badFindMinVal(arr, begin+1, end);
		if(arr[begin].compareTo(thing) <= 0) {
			return arr[begin];
		} else {
			return thing;
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("dave", 28);
		Person p2 = new Person("steve", 33);
		Child c1 = new Child("daisy", 12);
		Child c2 = new Child("joseph", 5);

		Person[] persons = {p1, p2};
		Child[] children = {c1, c2};

		System.out.println("Oldest: " + (c1.compareTo(c2) == 1 ? c1 : c2));

		System.out.println(
			goodFindMinVal(persons, 0, 1));
		System.out.println(
			badFindMinVal(persons, 0, 1));

		System.out.println(
			goodFindMinVal(children, 0, 1));

		//Compiler will complain here:
		//WildcardGenerics.java:54: <T>badFindMinVal(T[],int,int) in WildcardGenerics cannot be applied to (Child[],int,int)
		//	badFindMinVal(children, 0, 1));
		
                System.out.println();
		//	badFindMinVal(children, 0, 1));
                        }
}




   
