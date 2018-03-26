package interview_questions;

public class Palindrome_number 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1211;
		int temp;
		temp=b;
		while(b>0)
		{
			a=a*10+b%10;
			b=b/10;
		}
		if(temp==a)
		{
		System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
	}
}
