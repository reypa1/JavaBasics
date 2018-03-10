package interview_questions;

public class Rem_dup_strings_inArray 
{
	public static void main(String[] args) 
	{
	
		String s[]={"java","ruby","python","c#","c","javaScript","java","php","c"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1; j<s.length; j++)
			{
			
				if(s[i]==s[j])
						{
					System.out.println("Duplicate element is : "+s[i]);
						}
			}
		}
	}

}
