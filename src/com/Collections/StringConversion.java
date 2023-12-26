package com.Collections;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String originalString = "My name is Meghana";

	        // Display the original String
	        System.out.println("Original String: " + originalString);

	        // Convert String to StringBuffer
	        StringBuffer stringBuffer = new StringBuffer(originalString);
	        System.out.println("Converted to StringBuffer: " + stringBuffer);

	        // Convert String to StringBuilder
	        StringBuilder stringBuilder = new StringBuilder(originalString);
	        System.out.println("Converted to StringBuilder: " + stringBuilder);

	}

}
