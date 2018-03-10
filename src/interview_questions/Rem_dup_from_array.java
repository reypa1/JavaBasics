package interview_questions;
public class Rem_dup_from_array 
{
	public static int[] removeDuplicates(int[] input)
	{    
        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(i < input.length)
        {
            if(input[i] == input[j])
            {
                i++;
            }
            else
            {
                input[++j] = input[i++];
            }    
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++)
        {
            output[k] = input[k];
        } 
        return output;
    }
	
	public static void main(String[] args) 
	{
		 int[] input1 = {2,3,6,5,8,9,10,14,10,11,12,1};
	        int[] output = removeDuplicates(input1);
	        for(int i:output)
	        {
	            System.out.print(i+" ");
	}
  }
}