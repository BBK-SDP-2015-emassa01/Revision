/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Vehicle {

    protected int numberDoors;
    protected int numberWheels;
    protected String colour;

    public Vehicle(){
        //do nothing
    }
    public Vehicle(int a, int b, String s) {
// you need to complete this method
        this.numberDoors = a;
        this.numberWheels = b;
        this.colour = s;
    }

    @Override
    public String toString() {
// you need to complete this method
        return "Doors: " + this.numberDoors+ ", Wheels: " + this.numberWheels
                + ", Colour: " + this.colour;
    }
}
