package com.krish.interview;

import java.util.ArrayList;
import java.util.List;

public class FinalList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
	}

}
