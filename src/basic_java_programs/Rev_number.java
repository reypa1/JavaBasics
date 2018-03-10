package basic_java_programs;

public class Rev_number 
{
	public static void main(String[] args) 
	{	
		//using while loop
		int num = 12545,reversed = 0;
        while(num != 0) 
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);	
	}
}
