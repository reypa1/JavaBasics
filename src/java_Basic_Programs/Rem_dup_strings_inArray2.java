package java_Basic_Programs;
import java.util.HashSet;
import java.util.Set;
public class Rem_dup_strings_inArray2 
{
	public static void main(String[] args) 
	{
		String names[]={"java","ruby","python","c#","c","php", "java"};
		Set<String> s=new HashSet<String>();
		for (String str : names) 
		{
		if(s.add(str)==false)
		{
			System.out.println("Duplicate element is : "+str);
		}
		}
	}
}
