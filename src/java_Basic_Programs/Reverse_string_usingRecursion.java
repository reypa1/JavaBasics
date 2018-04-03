package java_Basic_Programs;

public class Reverse_string_usingRecursion 
{
	public static String revString(String str)
	{
		if(str.isEmpty())
			return str;
		
		return revString(str.substring(1))+str.charAt(0);
	}
	
	public static void main(String[] args) 
	{
		String str="PAVAN MUPPA";
		String reverse=revString(str);
		System.out.println("Reversed string is : "+reverse);
	}
}
