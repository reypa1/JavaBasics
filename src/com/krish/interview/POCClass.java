package com.krish.interview;

import java.util.HashMap;

@SuppressWarnings("serial")
public class POCClass extends Error{
	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap<>();
		System.out.println(map.put("A", null));
		System.out.println(map.put("A", 2));

		System.out.println(map.get("A"));

		System.out.println(hash("king") );
		
		
	}
	
	static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

}
