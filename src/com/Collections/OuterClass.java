package com.Collections;

public class OuterClass {
	
	private String outerMessage = "Happy christmas.";

    // Inner class
    public class InnerClass {
        // Inner class variable
    private String innerMessage = "Happy New year.";

        // Inner class method
        public void displayMessages() {
            System.out.println(outerMessage); // Accessing outer class variable
            System.out.println(innerMessage); // Accessing inner class variable
        }
    }

    // Main method to demonstrate inner class
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerInstance = new OuterClass();

        // Creating an instance of the inner class using the outer instance
        OuterClass.InnerClass innerInstance = outerInstance.new InnerClass();

        // Calling the method of the inner class to display messages
        innerInstance.displayMessages();

}
}
