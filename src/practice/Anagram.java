package practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
	String str1="Pavan";
	String str2="navpa";
	boolean status=true;
	if(str1.length() != str2.length())
	{
		status = false;
	}
	else
	{
		char c1[]=str1.toLowerCase().toCharArray();
		char c2[]=str2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		Arrays.equals(c1, c2);
	}

	if(status)
	{
		System.out.println(str1+ " and " +str2+ " are anagrams");
	}
	else
	{
		System.out.println(str1+ " and " +str2+ " are not anagrams");
	}
	}

}
