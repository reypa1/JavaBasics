package com.krish.interview;

public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pavan";

		for (char c = 'a'; c <= 'z'; c++) {
			int k = 0;
			for (int i = 0; i < s.length(); i++) {
				if (c == s.charAt(i)) {
					k++;
				}
			}
			if (k > 0)
				System.out.println(c + " : Repeated times is " + k);
		}
	}

}
