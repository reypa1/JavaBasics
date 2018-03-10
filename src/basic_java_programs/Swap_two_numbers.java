package basic_java_programs;

public class Swap_two_numbers 
{
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		swap(x,y);
		/*x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swappingx is :"+x);
		System.out.println("After swapping y is :"+y);*/
	}
	private static void swap(int x, int y) 
	{
		  int temp = x;
		  x = y;
		  y = temp;

		  System.out.println("After Swapping");
		  System.out.println("Value of x is :" + x);
		  System.out.println("Value of y is :" + y);
		 }
}