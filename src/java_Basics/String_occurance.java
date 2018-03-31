package java_Basics;

public class String_occurance 
{
	public static void main(String[] args) 
	{
	String s1="pavan";
	
	for(char c='a';c<='z';c++)
	{
		int k=0;
		for(int i=0; i<s1.length(); i++)
		{
			if(c==s1.charAt(i))	
			{
				k++;
			}
		}
		if(k>0)
		{
			System.out.println(c+" repeated : "+k);
		}
	  }
	}
}
