package interview_questions;

public class Remove_Junk 
{
	public static void main(String[] args)
	{
		String s="@#$%^!& Start Selenium )(*^@#!$@ 0412";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}
}
