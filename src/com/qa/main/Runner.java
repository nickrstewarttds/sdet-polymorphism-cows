package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		// POLYMORPHISM:
		// we can use constructors to build objects
		// while also borrowing functionality from base classes
		
		// from Cow, we get the variables and methods
		// from Cow, we get the constructor
		Cow cow1 = new Cow();
		
		// from Animal, we get the variables and methods
		// from Cow, we get the constructor
		Animal animal1 = new Cow();
		
		// from Object, we get the variables and methods
		// from Cow, we get the constructor
		Object object1 = new Cow();
		
		// we can't do this the other way around
		// as inheritance works down the hierarchy!
		// these won't work:
		// Cow cow2 = new Object();
		// Cow cow3 = new Animal();
		
		cow1.speak(); // <- from Cow
		//animal1.speak(); // inaccessible
		//object1.speak(); // inaccessible
		
		cow1.sleep(); // <- from Animal
		animal1.sleep(); // <- from Animal
		//object1.sleep(); // inaccessible
		
		cow1.toString(); // <- from Object
		animal1.toString(); // <- from Object
		object1.toString(); // <- from Object

	}

}
