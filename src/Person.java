/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
class Person implements Comparable<Person> {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public int compareTo(Person p) {
		if (this.age < p.getAge())
			return -1;
		else if (this.age == p.getAge()) 
			return 0;
		else 
			return 1;
	}

	@Override
	public String toString() {
		return "Person: " + name + " Age: " + age;
	}
}
