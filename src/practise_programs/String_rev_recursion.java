package practise_programs;

public class String_rev_recursion 
{
	public static String reverse(String str)
	{
		if(str.isEmpty())
		return str;
		
		return reverse(str.substring(1))+str.charAt(0);
	}
	
	public static void main(String[] args) 
	{
		String str="pavan";
		String rev=reverse(str);
		System.out.println(rev);
	}
}
