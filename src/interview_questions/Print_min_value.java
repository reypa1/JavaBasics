package interview_questions;

public class Print_min_value 
{
	public static void main(String[] args) 
	{
		int min_num[]={2,25,33,37,12,40,99,108};
		int smallest=min_num[0];
		for(int i=1; i< min_num.length; i++)
        {
            if (min_num[i] < smallest)                  
             
            	smallest = min_num[i];  
        }
        System.out.println("Smallest Number is : " + smallest);
	}
}
