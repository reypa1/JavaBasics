package java_Basics;

public class Print_min_max_num_inArray 
{
	public static void main(String[] args) 
	{
		int [] numbers={1,2,4,5,9,14,-12};
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=0;i<numbers.length;i++)
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
		System.out.println("Largest  number in a given array is : "+largest);
		System.out.println("smallest number in a given array is : "+smallest);
	}
}