package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> populationMap = new HashMap<>();

        // Add key-value pairs to the map
        populationMap.put("Srilanka", 258930000);
        populationMap.put("nepal", 85216107);
        populationMap.put("India", 13938657);
        populationMap.put("Indonesia", 21365247);

        // Displaying elements of the map
        System.out.println("Population Map:");

        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a key is present in the map
        String countryToCheck = "India";
        if (populationMap.containsKey(countryToCheck)) {
            System.out.println("\n" + countryToCheck + " is present in the map.");
        } else {
            System.out.println("\n" + countryToCheck + " is not present in the map.");
        }

        // Remove a key from the map
        String countryToRemove = "Indonesia";
        populationMap.remove(countryToRemove);
        System.out.println("\nAfter removing " + countryToRemove + ":");
        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
