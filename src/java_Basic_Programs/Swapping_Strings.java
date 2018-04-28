package java_Basic_Programs;
public class Swapping_Strings 
{
	public static void main(String[] args) 
	{
		String str1="Hello";
		String str2="World";
		
		System.out.println("String before swapping : "+str1);
		System.out.println("String before swapping : "+str2);
		
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());	
		
		System.out.println("String After swapping  : "+str1);
		System.out.println("String After swapping  : "+str2);
	}
}