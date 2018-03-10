package interview_questions;

public class Palindrome_number 
{
	public static void main(String[] args) 
	{
		int b=0;
		int temp;
		int a=121;
		temp=a;
		while(a>0)
		{
			b=b*10+a%10;
			a=a/10;
		}
		if(temp==b)
		System.out.println("Number is palindrome");
		else
			System.out.println("Number is not a palindrome");
	}
}
