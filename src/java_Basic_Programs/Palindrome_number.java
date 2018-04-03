package java_Basic_Programs;

public class Palindrome_number 
{
	public static void main(String[] args) 
	{
		int a=121;
		int b=0;
		int temp;
		temp=a;
		
		while(a>0)
		{
			b=b*10+a%10;
			a=a/10;
		}
         if(temp==b) 
         {
        	 System.out.println("Given number is a palindrome");
         }
         else
         {
        	 System.out.println("Given number is not a palindrome"); 
         }
	}
}