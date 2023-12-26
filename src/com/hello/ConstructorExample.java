package com.hello;

public class ConstructorExample {
	
	 public ConstructorExample() {
	        System.out.println("Default Constructor: This is the default constructor.");
	    }

	    // Parameterized constructor with two parameters
	    public ConstructorExample(String param1, int param2) {
	        System.out.println("Parameterized Constructor: Param1 = " + param1 + ", Param2 = " + param2);
	    }

	    // Copy constructor
	    public ConstructorExample(ConstructorExample other) {
	        System.out.println("Copy Constructor: Creating a copy of another object.");
	    }

	    // Main method to demonstrate constructor types
	    public static void main(String[] args) {
	        // Creating objects using different constructors
	        ConstructorExample defaultConstructorObj = new ConstructorExample();
	        ConstructorExample parameterizedConstructorObj = new ConstructorExample("Hello", 42);
	        ConstructorExample copyConstructorObj = new ConstructorExample(defaultConstructorObj);

}
}