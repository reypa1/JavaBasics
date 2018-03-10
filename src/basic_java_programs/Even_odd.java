 package basic_java_programs;

public class Even_odd 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		for (int a=5; a<=10; a=a++)
		{
			 if (a%2==0)
			{
				 System.out.println(a+" is even"); 
				 break;
			}
			else
			{
				 System.out.println(a+" is odd");
				 break;
			}	   
		}
	}
}
