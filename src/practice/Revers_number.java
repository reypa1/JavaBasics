package practice;

public class Revers_number {

	public static void main(String[] args) 
	{
	int a=121;
	int b=0;
	while(a != 0)
	{
		b=b*10+a%10;
		a=a/10;
	}
	System.out.println("Reversed number is : "+b);
	}

}
