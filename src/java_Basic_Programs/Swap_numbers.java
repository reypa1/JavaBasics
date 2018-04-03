package java_Basic_Programs;

public class Swap_numbers 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		
		System.out.println("Value of x before swapping : "+x);
		System.out.println("Value of y before swapping : "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of x before swapping : "+x);
		System.out.println("Value of y before swapping : "+y);
	}
}
