package java_Basics;

public class Print_duplicates_occurances 
{
	public static void main(String[] args) 
	{
		String s1="pavankumarmuppa";
		for(char c='a'; c<='z'; c++)
		{
			int k=0;
			
			for(int i=0; i<s1.length(); i++)
			{
				if(c==s1.charAt(i))
				{
					k++;
				}
			}
			if(k>1)
			{
				System.out.println("Duplicate character is :  " +c+" and it repeats : " + k + " times");
			}
		}
	}
}