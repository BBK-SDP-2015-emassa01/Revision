/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
class Child extends Person {
	public Child(String name, int age) {
		super(name, age);
	}
	@Override
	public String toString() {
		return "Child-" + super.toString();
	}
}
