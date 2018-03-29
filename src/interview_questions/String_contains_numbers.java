package interview_questions;

public class String_contains_numbers 
{
	public static void main(String[] args) 
	{
		 String str1 = "1234a6789";
		 String str2 = "123456789";
		 
		    System.out.println(str1 + ":" + str1.matches("[0-9]+"));
		    System.out.println(str2 + ":" + str2.matches("[0-9]+")); 
	}

}
