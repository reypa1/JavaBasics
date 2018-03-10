package interview_questions;

public class Swap_two_numbers 
{
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		//2 method using multiplication
		//x=x*y;
		//y=x/y;
		//x=x/y;
		
		//3 method using XOR operator
		//x=x^y;
		//y=x^y;
		//x=x^y;
		
		
		System.out.println("After swapping x is : "+x);
		System.out.println("After swapping y is : "+y);
	}
}