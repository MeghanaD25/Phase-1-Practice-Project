package com.hello;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int intValue = 10;
	     double doubleValue = intValue; // Automatically converts int to double
	     System.out.println("Implicit Casting (Widening): int to double - Result: " + doubleValue);

	     double anotherDoubleValue = 15.75;
	     int anotherIntValue = (int) anotherDoubleValue; // Requires explicit casting
	     System.out.println("Explicit Casting (Narrowing): double to int - Result: " + anotherIntValue);
	}

}
