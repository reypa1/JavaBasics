package interview_questions;

public class Rev_String_using_recursion 
{
	public static String revString(String str)
	{
		if(str.isEmpty())
			return str;
		
		return revString(str.substring(1))+str.charAt(0);
	}
	
	public static void main(String[] args) 
	{
		String str="PAVAN MUPPA";
		String reverse=revString(str);
		System.out.println(reverse);

	}
}
