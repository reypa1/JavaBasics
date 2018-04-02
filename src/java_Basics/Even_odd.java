package java_Basics;

public class Even_odd {

	public static void main(String[] args) 
	{
      int a=14;
      if(a%2==0)
      {
    	  System.out.println("Given number is even");
      }
      else
      {
    	  System.out.println("Given number is odd");
      }
      
      //Sorting numbers into even and ood
      int array[]={1,2,5,6,3,2};  
      System.out.println("Odd Numbers:");  
      for(int i=0;i<array.length;i++)
      {  
      if(array[i]%2!=0)
      {  
      System.out.println(array[i]);  
      }  
      }  
      System.out.println("Even Numbers:");  
      for(int i=0;i<array.length;i++)
      {  
      if(array[i]%2==0){  
      System.out.println(array[i]);  
      }  
      }  
	}
}