package interview_questions;
import java.util.HashSet;
public class Long_subString_String 
{
public static String substring(String input)
{
	HashSet<Character> set=new HashSet<Character>();
	String s1="";
	String s2="";
	for(int i=0;i<input.length();i++)
	{
		char ch=input.charAt(i);
		
		if(set.contains(ch))
		{
			s1="";
			set.clear();
		}
		s1=s1+ch;
		set.add(ch);
		
		if(s1.length()>s2.length())
		{
			s2=s1;
		}
	}
	return s2;
}
	
	public static void main(String[] args) 
	{
		String input="pavankumar";
		System.out.println(substring(input));
	}
}