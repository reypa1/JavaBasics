package interview_questions;
public class Rev_String_without_keyword 
{
	public static void main(String[] args) 
	{
			String str="pavan kumar muppa";
	        String reverse = "";
	        for(int i=str.length()-1; i>=0; i--)
	        {
	            reverse =reverse + str.charAt(i);
	        }
	        System.out.println(reverse); 
	}
}
