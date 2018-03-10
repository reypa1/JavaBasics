package interview_questions;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Remove_dup_char_in_string 
{
	public static void main(String[] args) throws Exception 
	{
		String str="pavan";
        String ans="";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            ans = ans + ch;
            str = str.replace(ch,' '); //Replacing all occurrence of the current character by a space
        }
        System.out.println("Word after removing duplicate characters : " + ans);
	}
}
