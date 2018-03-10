package com.krish.interview;

import java.util.HashMap;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "This is Epsion company";
		String[] arr = s1.split("\\s");
		System.out.println(arr.length);

		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(null, null);
		hm.put(1, null);
		System.out.println(hm.size());
	}

}
