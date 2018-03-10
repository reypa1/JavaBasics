package practice;

public class Remove_duplicate {

	public static void main(String[] args) 
	{
	String str1="pavankumar";
	String str2="";
	for(int i=0;i<str1.length();i++)
	{
	char ch=str1.charAt(i)	;
	if(ch !=' ')
	str2=str2+ch;
	str1=str1.replace(ch, ' ');
	}
	System.out.println(str2);
	}

}
