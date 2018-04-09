package java_Basic_Programs;

public class Reverse_number 
{
	public static void main(String[] args) 
	{
		int a=12;
		int b=0;
		while(a!=0)
		{
			b=b*10+a%10;
			a=a/10;
		}
		System.out.println("Revaersed number is : "+b);
	}
}