package practise_programs;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
String str1="pavan";
String str2="kumar";
//String str2="anvap";
boolean status = true;
if(str1.length() != str2.length())
{
	status =false;
}
else
{
	char c1[]=str1.toLowerCase().toCharArray();
	char c2[]=str2.toLowerCase().toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	status=Arrays.equals(c1, c2);
	if(status)
	{
		System.out.println(str1 + " and " + str2 + " are anagarams");
	}
	else
	{
		System.out.println(str1 + " and " + str2 + " are not anagarams");
	}
}
}
}