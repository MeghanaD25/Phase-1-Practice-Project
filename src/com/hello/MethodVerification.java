package com.hello;

public class MethodVerification {

	 public static void displayMessage() {
	        System.out.println("This is a message from the displayMessage method.");
	    }

	    // Method with parameters and a return value
	    public static int addNumbers(int a, int b) {
	        return a + b;
	    }

	    // Method with default (package-private) access
	    static void defaultMethod() {
	        System.out.println("This is a default (package-private) method.");
	    }

	    // Private method that can be used within the class
	    private static void privateMethod() {
	        System.out.println("This is a private method.");
	    }

	    // Main method to demonstrate method implementations and calls
	    public static void main(String[] args) {
	        // Calling a method with no parameters and no return value
	        displayMessage();

	        // Calling a method with parameters and capturing the return value
	        int result = addNumbers(5, 7);
	        System.out.println("Result of adding numbers: " + result);

	        // Calling a method with default (package-private) access
	        defaultMethod();

	        // Calling a private method within the same class
	        privateMethod();
}
}