package interview_questions;

public class Rev_sentence_inString 
{
	public static void main(String[] args) 
	{
		String input = " I love India";
		String[] split = input.split(" ");
		String result = " ";
		for(int i = split.length - 1; i >= 0; i--) 
		{
		  result = result + (split[i] + " ");
		}
		System.out.println(result.trim());
	}
}
