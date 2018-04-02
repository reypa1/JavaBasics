package java_Basics;
import java.util.HashMap;
import java.util.Map;

public class Frequency_of_string_in_string 
{
	public static void main(String[] args) 
	{
		    String s = "hi pavan kumar muppa pavan kumar hi";
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