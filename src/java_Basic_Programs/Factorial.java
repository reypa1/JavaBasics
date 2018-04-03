package java_Basic_Programs;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=1;
		
		for(int i=1;i<=a;i++)
		{
			b=b*i;
		}
            System.out.println("factorial of " + a + " = "+b);
	}
}