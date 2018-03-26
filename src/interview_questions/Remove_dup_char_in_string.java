package interview_questions;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Remove_dup_char_in_string 
{
	public static void main(String[] args) throws Exception 
	{
		String s1="pavan kumar muppa";
        String s2="";
        for(int i=0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(ch!=' ')
            s2 = s2 + ch;
            s1 = s1.replace(ch,' '); //Replacing all occurrence of the current character by a space
        }
        System.out.println("Word after removing duplicate characters : " + s2);
	}
}
