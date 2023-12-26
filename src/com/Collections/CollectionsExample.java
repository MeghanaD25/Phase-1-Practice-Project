package com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        // Displaying elements of ArrayList
        System.out.println("ArrayList Example:");
        for (String language : arrayList) {
            System.out.println(language);
        }

        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Orange", 8);

        // Displaying elements of HashMap
        System.out.println("\nHashMap Example:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
