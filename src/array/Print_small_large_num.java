package array;

public class Print_small_large_num {

	public static void main(String[] args) 
	{
		int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};
		  int smallest = numbers[0];
		  int largetst = numbers[0];

		  for (int i = 0; i<numbers.length; i++) {
		   if (numbers[i]==largetst)
		    largetst = numbers[i];
		   else if (numbers[i]==smallest)
		    smallest = numbers[i];
		  }

		  System.out.println("Largest Number is : " + largetst);
		  System.out.println("Smallest Number is : " + smallest);	

	}

}
