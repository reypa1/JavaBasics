package interview_questions;

public class Rev_twoWords 
{
	public static void main(String[] args) 
	{
		String str="Pavan Kumar";
		String str1[]=str.split("\\s");
		for (int i = 0; i < str1.length; i++) 
		{
			String s3 = str1[i];
			for (int j = s3.length()-1; j >= 0; j--) 
		{
				System.out.print(s3.charAt(j));
		}
			System.out.print(" ");
		}
	}
}
