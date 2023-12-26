package com.hello;

public class AccessModifiers {

	public void publicMethod() {
        System.out.println("This is a public method");
    }

    // Protected method can be accessed within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    // Default (package-private) method can be accessed within the same package
    void defaultMethod() {
        System.out.println("This is a default (package-private) method");
    }

    // Private method can only be accessed within the same class
    private void privateMethod() {
        System.out.println("This is a private method");
    }

    // Main method to demonstrate access modifiers
    public static void main(String[] args) {
        AccessModifiers example = new AccessModifiers();

        // Accessing methods with different access modifiers
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.privateMethod();
    }
}
