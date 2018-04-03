package java_Basic_Programs;

public class Count_words_In_String 
{
	public static void main(String[] args) 
	{
		String s = "I love to read books";
		 
		int count = 1;
 
		for (int i = 1; i < s.length(); i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}