package practise_programs;

public class String_palindrome 
{
	public static void main(String[] args) 
	{
		String str1="madam";
		String str2="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
			if(str1.equals(str2))
			{
				System.out.println(str2+" is palindrome");
			}
			else
			{
				System.out.println(str2+" is not a palindrome");
			}
		}
	}
