package interview_questions;
import java.util.HashMap;
import java.util.Map;

public class Frequency_of_string_in_string 
{
	public static void main(String[] args) 
	{
		    String s = "Hi myself pavan myself kumar myself muppa";
	        String a[] = s.split(" ");
	        Map<String, Integer> words = new HashMap<>();
	        for (String str : a) 
	        {
	            if (words.containsKey(str)) 
	            {
	                words.put(str, 1 + words.get(str));
	            }
	            else 
	            {
	                words.put(str, 1);
	            }
	        }
	       System.out.println(words);
	}
}