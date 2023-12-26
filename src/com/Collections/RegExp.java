package com.Collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "The year 2023 is coming to an end. Welcome to 2024?";

        // Define a regular expression pattern to match years
        String regex = "\\b\\d{4}\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(inputString);

        // Find and display matches
        System.out.println("Input String: " + inputString);
        System.out.println("Years in the String:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

	}

}
