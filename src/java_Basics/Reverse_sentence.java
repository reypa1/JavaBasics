package java_Basics;

public class Reverse_sentence 
{
	public static void main(String[] args) 
	{
		String s1= "I love to read books";
		String s2[]=s1.split(" ");
		String s3=" ";
		for(int i=s2.length-1; i>=0; i--)
		{
			s3=s3+(s2[i]+" ");
		}
		System.out.println(s3);
	}
}