package interview_questions;

public class Print_max_number 
{
	public static void main(String[] args) 
	{
		 int max_num[] ={32,43,53,54,32,65,163,98,43,2};
         int largetst = max_num[0];
        
         for(int i=1; i< max_num.length; i++)
         {
                 if(max_num[i] > largetst)
                  
                 largetst = max_num[i];
                
         }
        System.out.println("Largest Number is : " + largetst);
	}
}
