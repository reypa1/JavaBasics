package com.krish.interview;

import java.util.HashMap;
import java.util.Map;

public class StringOccurenceHashmap {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "harikrishaana";
		HashMap<Character, Integer> h = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (h.containsKey(s1.charAt(i))) {
				h.put(s1.charAt(i), h.get(s1.charAt(i)) + 1);
			} else {
				h.put(s1.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> string : h.entrySet()) {

			if (string.getValue() >= 2) {
				System.out.println();
				System.out.print(string.getKey());
				System.out.print("---" + string.getValue());
			}
		}
	}

}
