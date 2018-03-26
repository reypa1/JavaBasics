package interview_questions;

public class Swap 
{

	public static void swap(int a, int b)
	{
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping  a is : "+a);
		System.out.println("After swapping  b is : "+b);
	}
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		swap(a,b);
		
		System.out.println("Before swapping a is : "+a);
		System.out.println("Before swapping b is : "+b);

	}

}
