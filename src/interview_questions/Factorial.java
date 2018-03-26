package interview_questions;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int a = 9;
        long b = 1;
        for(int i = 1; i <= a; i++)
        {
            b = b * i;
        }
        System.out.println("Factorial of "+a+" is: "+b);
	}
}
