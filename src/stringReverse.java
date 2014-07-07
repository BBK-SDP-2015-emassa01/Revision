/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class stringReverse {
    
public static void main(String[] args) {
    
System.out.println(reverse("abcdef", 6));
    String s = "esha";
    int len = 4;
    String result = reverse(s,len);
    System.out.println(result);

    System.out.println(reverseMemory("JabberEshie", 6, 5));

    System.out.println(fib(6));
}



public static String reverse(String s, int len) {

if (len > 0) {
//    System.out.print("s.substring(1) + charAt(0): "+s.substring(1) + s.charAt(0)+"\n");
//    System.out.println("--len: "+--len);
//    System.out.println("s.charAt(0): "+s.charAt(0) +"\n");
//    System.out.println("leave method \n");
//    System.out.println("Perform op on: "+ s.substring(1) + s.charAt(0));
return reverse(s.substring(1), --len) + s.charAt(0);
}
return "";
}

public static String reverseMemory(String s, int lenA, int lenB) {
String one = reverse(s.substring(0, lenA), lenA);
String two = reverse(s.substring(lenA), lenB);
return reverse(one + two, one.length() + two.length());
}


public static String reverseMemory2(String s, int lenA, int lenB) {
String one = s.substring(0, lenA);
String two = s.substring(lenA);
return two + one;
}

public static int fib(int n) {
if ((n == 1) || (n == 2)) {
return 1;
} else {
int result = fib(n-1) + fib(n-2); // method calls itself
return result;
}
}

public static int factorial(int n){
    if(n==1) {
        return 1;
    }
    return factorial(n-1) *n;
}

}
    

