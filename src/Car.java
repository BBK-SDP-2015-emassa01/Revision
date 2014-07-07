
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Car extends Vehicle {

    private int numberSeats;
    private String modelName;

    public Car(int a, int b, String s, int c, String t) {
// you need to complete this method
        //super();
        super(a,b,s);
        this.numberSeats = c;
        this.modelName=t;
    }

    public Car(Vehicle v, int a, String s) {
// you need to complete this method
        super(v.numberDoors, v.numberWheels, v.colour);
        this.numberSeats =a;
        this.modelName =s;
    }

    @Override
    public String toString() {
// you need to complete this method
        return super.toString()+ ", Seats: " + this.numberSeats + ", Model: " + this.modelName;
    }
    
    public static void main(String args[]){
         
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle a = new Car(5,2,"red", 4, "Toyoda");
        Vehicle b = new Car(3,3,"purple", 3, "Audi");
        Vehicle c = new Vehicle(3,4,"red");
        
        vehicles.add(a);
        vehicles.add(b);
        vehicles.add(c);
        
        for (Vehicle listItem : vehicles){
            System.out.println(listItem);
        }
        
        
    }

}
