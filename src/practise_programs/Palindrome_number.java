package practise_programs;

public class Palindrome_number 
{
	public static void main(String[] args) 
	{
	int a=212;
	int b=0;
	int temp;
	temp=a;
	while(a>0)
	{
		b=b*10+a%10;
		a=a/10;
		
	}
	System.out.println("Reversed number is : "+b);
	if(temp==b)
	{
		System.out.println("given number is palindrome");
	}
	else
	{
		System.out.println("given number is not a palindrome");
	}
      
	}
}
