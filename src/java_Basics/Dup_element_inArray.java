package java_Basics;

public class Dup_element_inArray 
{
	public static void main(String[] args) 
	{
		//For string
		String [] s1={"java", "c","c++","javascript", "java", "c"};
	
        for (int i = 0; i < s1.length; i++)
        {
            for (int j = i+1; j < s1.length; j++)
            {
                if ((s1[i] == s1[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+s1[j]);
                }
            }
        }
        
      //For numbers  
      int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
      
      for (int i = 0; i < my_array.length; i++)
      {
          for (int j = i+1; j < my_array.length; j++)
          {
              if ((my_array[i] == my_array[j]) && (i != j))
              {
                  System.out.println("Duplicate Element : "+my_array[j]);
              }
          }
      }
	}
}