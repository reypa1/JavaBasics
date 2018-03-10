package interview_questions;

public class Swap_two_numbers_ThirdVariable 
{
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		
		//With third variable
		int temp;
		temp=x;
		x=y;
		y=temp;
		
		//Without third variable
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swapping x is : "+x);
		System.out.println("After swapping y is : "+y);
	}
}