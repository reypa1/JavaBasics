package java_Basic_Programs;

public class Swap_using_Temp 
{
	public static void main(String[] args) 
	{
	int a=10;
	int b=20;
	
	System.out.println("The value of a before swapping : " +a);
	System.out.println("The value of a before swapping : " +b);
	
	int temp;
	temp=a;
	a=b;
	b=temp;
	
	System.out.println("The value of a After swapping  : " +a);
	System.out.println("The value of a Afetr swapping  : " +b);
	

	}

}
