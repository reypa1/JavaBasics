package practise_programs;

public class String_occurance 
{
public static void main(String[] args) 
{
String str1="pavankumar";
for(char c='a'; c<='z';c++)
{
	int k=0;
	for(int i=0;i<str1.length();i++)
	{
		if(c==str1.charAt(i))
		{
			k++;
		}
	}
		if(k>0)
			System.out.println(c+ " repeated " +k+ " times");	
}
}
}
