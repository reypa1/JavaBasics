package interview_questions;

public class Count_words_In_String 
{
	public static void main(String[] args) 
	{
		String s = "I love cricket";
		 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}
