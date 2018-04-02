package java_Basics;

public class Find_missing_number 
{
	public static void main(String[] args) 
	{
		int[] a={-2,-1,0,1,2,3,4,5,6,8,9,10};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		int sum1=0;
        for(int j=-2; j<=10; j++)
        {
        	sum1=sum1+j;
        }
        System.out.println("Missing number is : "+(sum1-sum));
	}
}
