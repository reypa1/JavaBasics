package com.krish.interview;

public class StringEqal {

	public static void main(java.lang.String[] args) 
	{
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		}

}
