package java_Basic_Programs;

public class Remove_duplicates_String 
{
	public static void main(String[] args) 
	{
		String s1="pavankumar";
		String s2="";
		for(int i=0;i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch!=' ')
			{
				s2=s2+ch;
				s1=s1.replace(ch, ' ');
			}
		}
          System.out.println("Word with unique characters is : "+s2);
	}
}