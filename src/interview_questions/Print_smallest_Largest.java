
package interview_questions;
public class Print_smallest_Largest 
{
	public static void main(String[] args) 
	{
		int numbers[]={-18,1,2,5,9,14,1238};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=1; i<numbers.length; i++)
		{
		if(numbers[i]>largest)
		{
			largest=numbers[i];
		}
		else if(numbers[i]<smallest)
		{
			smallest=numbers[i];
		}
		}
		System.out.println("Largest number in a given array  is : "+largest);
		System.out.println("smallest number in a given array is : "+smallest);	
	}
}