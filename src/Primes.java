/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class Primes {

    int startNum = 2;
    boolean prime = true;
    
    

public void primeCalc(){
System.out.print("Please enter a number: ");
Scanner s = new Scanner(System.in);
int num = s.nextInt();

for ( int i = startNum; i< Math.sqrt(num); i++){
    if (num%i==0){
        prime = false;
    }
    if (num%i!=0){
       System.out.println(i);
    }
}

//if (prime == true){
//    System.out.print(num + " is a prime!");
//}
//else {
//    System.out.print(num + " is not a prime!");
//}
   
}
}
