package interview_questions;
public class String_manuplation 
{
public static void main(String[] args) 
	{
		String str="Rains have started here";
		
		//Find length of string
		System.out.println("Length of a given string is : "+str.length());
		//Find the character
		System.out.println("Character of a particular index is : "+str.charAt(4));
		//Find the index of a character
		System.out.println("Index of character is : "+str.indexOf("s"));
		//Print the substring
		System.out.println(str.substring(0, 5));
		//Print index of string
		System.out.println(str.indexOf("have"));
		//print the string which is not present
		System.out.println(str.indexOf("hai"));
		//string comparision
		String str1="pavan";
		String str2="pavan";
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		//Trim the string
		String str3="  Hello  world  ";
		System.out.println("After trim the string is :" +str3.trim());
		//Remove the middle spaces in a string
		System.out.println("After removing the middle spaces string is :"+str3.replaceAll(" ", ""));
		//Replace the string
		String str4="12/04/1992";
		System.out.println("string before replacement is : "+str4);
		System.out.println("string after replacement is : "+str4.replaceAll("/", "-"));
		//String concatination
		String str6="career";
		System.out.println("String before concatination is : "+str6);
		System.out.println("String after concatination is : "+str6.concat("s"));
		int a=10;
		int b=20;
		String s1="hai";
		String s2="dude";
		System.out.println("Adding two integers : "+(a+b));
		System.out.println("Adding two strings : "+s1+" "+s2);
		System.out.println(s1+s2+a+b);
		System.out.println(a+b+s1+s2);
		System.out.println(s1+s2+(a+b));
	}
}
